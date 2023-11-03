public class StudentTest
{
    public static void main(String[] args)
    {
        //create three new students with given parameters
        Student student1 = new Student("John", "Doe", 12345, "john.doe@example.com", "Computer Science");
        Student student2 = new Student("Jane", "Smith", 67890, "jane.smith@example.com", "Biology");
        Student student3 = new Student("Bob", "Johnson", 54321, "bob.johnson@example.com", "History");

        System.out.println(student1.toString()); //print info for each student
        System.out.println();
        System.out.println(student2.toString());
        System.out.println();
        System.out.println(student3.toString());
        System.out.println();

        student3.setEmail("bob.johnson@newemail.com"); // Change email for student 3

        System.out.println("Updated Student Information:");
        System.out.println(student3.toString()); //reprint info for student 3
    }
}