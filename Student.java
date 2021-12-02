import java.util.Vector;

public class Student extends Person
{
  private String id;
  private String name;
  private Vector<Course> courses; // contains all courses the student is registered in

	//Constructor
	public Student(String stdName, String stdId)
	{
		name = stdName;
		id = stdId;
		courses = new Vector<Course>();
	}

	//returns student name
	public String getName()
	{
		return name;
	}

	//returns student id
	public String getId()
	{
		return id;
	}

	public String toString()
	{
     // return a string representation of a student using the following format:
     // 100234546 John McDonald
     // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

		String representation = id + " " + name + "\n" + "Registered courses: ";

		for(int i = 0; i < courses.size(); i++)
		{
			representation += courses.elementAt(i) + ", ";
		}
		return representation;
	}

	//Checks to see if the student is registered in a course already
	public boolean isRegisteredInCourse(Course course)
	{
		for(int i = 0; i < courses.size(); i++)
		{
			if(course == courses.elementAt(i))
			{
				return true;
			}
		}
		return false;
	}

	//registers a student into a course if they are not in it already
	public void registerFor(Course course)
	{
		if(isRegisteredInCourse(course) == false)
		{
			courses.add(course);
			course.addStudentToCourse(this);
		}
	}
}
