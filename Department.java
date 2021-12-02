 import java.util.HashSet;
import java.util.Vector;

public class Department
{
   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course> courseList; // all courses offered by the department
   private Vector<Student> registerList; // all students taking courses in the department.

   //Constructor
   public Department(String name, String id)
   {
      this.name = name;
      this.id = id;
      courseList = new Vector<Course>();
      registerList = new Vector<Student>();
   }

   public String getName()
   {
      return name;
   }

   public String getId()
   {
      return id;
   }
 	
   public String toString()
   {
      // returns a string representation of department name, number 
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students

      String representation = id + ": " + courseList.size() + " courses, " + registerList.size() + " students";
      return representation;
   }

   //adds a course to the department
   public void offerCourse(Course course)
   {
      courseList.add(course);
   }

   //adds new student to register list
   public void addStudent(Student student)
   {
      for(int i = 0; i < registerList.size(); i++)
      {
         if(student == registerList.elementAt(i))
         {
            return;
         }
      }
      registerList.add(student);
   }

   //prints a list of courses in the department
   public void printCoursesOffered()
   {
      for(int i = 0; i < courseList.size(); i++)
      {
         courseList.elementAt(i).toString();
      }
   }

   //prints a list of students who take courses in the department
   public void printStudentsByName()
   {
      for(int i = 0; i < registerList.size(); i++)
      {
         registerList.elementAt(i).toString();
      }
   }

   //Checks to see if a student is registered in any course in the department
   public boolean isStudentRegistered(Student student)
   {
      for(int i = 0; i < registerList.size(); i++)
      {
         if(student == registerList.elementAt(i))
         {
            return true;
         }
      }
      return false;
   }

   //returns a list of students from a course of a given code
   public Vector studentsRegisteredInCourse(int code)
   {
      for(int i = 0; i < courseList.size(); i++)
      {
         if(code == courseList.elementAt(i).getCourseNumber())
         {
            return courseList.elementAt(i).getClassList();
         }
      }
      return null;
   }

   //prints a list of students from a course of a given code
   public void printStudentsRegisteredInCourse(int code)
   {
      Vector<Student> students = studentsRegisteredInCourse(code);

      System.out.println("Students in course code:" + code);
      for(int i = 0; i < students.size(); i++)
      {
         System.out.println(students.elementAt(i).getName() + " " + students.elementAt(i).getId());
      }
   }

   //returns course with the largest number of registered students
   public Course largestCourse()
   {
      Course largest = null;
      int largestNumberOfStudents = 0;

      for(int i = 0; i < courseList.size(); i++)
      {
         if(courseList.elementAt(i).getClassSize() > largestNumberOfStudents)
         {
            largest = courseList.elementAt(i);
            largestNumberOfStudents = courseList.elementAt(i).getClassSize();
         }
      }
      return largest;
   }
}
