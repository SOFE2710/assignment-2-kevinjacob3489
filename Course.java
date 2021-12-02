import java.util.Vector;

public class Course
{
   private Department dept;
   private String title; // title of the course (e.g. Intro to programming);
   private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
   private int number; // course number, e.g. 1200, 2710, 2800, etc.
   private Vector<Student> classList; // contains all students registered in this course

    //Constructor
   public Course(String code, int number, Department dept, String title)
   {
       this.code = code;
       this.number = number;
       this.dept = dept;
       this.title = title;
       classList = new Vector<Student>();
   }

   public Course()
   {
	// TODO Auto-generated constructor stub
   }

   //returns the course number
   public int getCourseNumber()
   {
       return number;
   }

   //returns the class list of the course
   public Vector getClassList()
   {
       return classList;
   }

    //returns the class size of the course
    public int getClassSize()
    {
        return classList.size();
    }

    //returns the department of the course
    public Department getDept()
    {
        return dept;
    }

    //adds a new student to the course
    public void addStudentToCourse(Student student)
    {
        classList.add(student);
        getDept().addStudent(student);
    }
 
  public String toString()
  {
     // return a string representation of the course with the course code,
     // name, and number of people registered in the course in the following
     // format:
     // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

      String representation = code + " " + number + " " + title + ", Enrollment = " + classList.size();
      return representation;
  }
}
