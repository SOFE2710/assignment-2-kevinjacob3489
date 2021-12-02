
public class TestDriver
{
	public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        //create departments
	    Department ecse=new Department("Electrical, Computer and Software Engineering", "ECSE");
	    Department amme=new Department("Automotive, Mechanical and Manu Engineering", "AMME");
	      
	    //Create courses
	    Course engr1200 = new Course("ENGR", 1200, ecse, "Introduction to Programming");
	    Course sofe2800 = new Course("SOFE", 2800, ecse, "Web Programming");
	    Course sofe2710 = new Course("SOFE", 2710, ecse, "Java Programming");
	    Course mece2430 = new Course("MECE", 2430, amme, "Dynamics");

	    //Create students
	    Student john = new Student("100232122", "Jon Maxwell");
        Student sarah = new Student("100523332", "Sarah Lee");
        Student emily = new Student("100512132", "Emily Johnson");
        Student alex = new Student("100232732", "Alex Williams");
        Student jane = new Student("100989832", "Jane Wesley");

        System.out.println(john);
        System.out.println(sarah);
        john.registerFor(engr1200);
        john.registerFor(sofe2800);
        emily.registerFor(engr1200);
        alex.registerFor(sofe2800);
        jane.registerFor(mece2430);
        jane.registerFor(engr1200);
        sarah.registerFor(mece2430);
        System.out.println(engr1200);
        System.out.println(sofe2800);
        System.out.println(mece2430);
        System.out.println(ecse);
        System.out.println(amme);

        //Student john
        john.registerFor(engr1200);
        john.registerFor(sofe2800);
        john.registerFor(sofe2710);

        //Student Sarah
        sarah.registerFor(engr1200);
        sarah.registerFor(sofe2800);

        //Student emily
        emily.registerFor(mece2430);

        //Student alex
        alex.registerFor(engr1200);
        alex.registerFor(mece2430);

        //print the department
        System.out.println("List of Depts.");
	    System.out.println(ecse);
	    System.out.println(amme);

        //print the courses
	    System.out.println("List of Courses");
	    System.out.println(engr1200);
        System.out.println(sofe2800);
        System.out.println(sofe2710);
        System.out.println(mece2430);
	}
}
