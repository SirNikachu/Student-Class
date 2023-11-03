public class Student
{
        private final String firstName;
        private final String lastName;
        private final int studentId;
        private String email;
        private final String major;

        public Student(String firstName, String lastName, int studentId, String email, String major)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentId = studentId;
            this.email = email;
            this.major = major;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getLastName()
        {
            return lastName;
        }

        public int getStudentId()
        {
            return studentId;
        }

        public String getEmail()
        {
            return email;
        }

        public void setEmail(String email)
        {
            this.email = email;
        }

        public String getMajor() 
        {
            return major;
        }

        public String toString()
        {
            return "Student Information:\n" +
                    "Full Name: " + firstName + " " + lastName + "\n" +
                    "Student ID: " + studentId + "\n" +
                    "Email: " + email + "\n" +
                    "Major: " + major;
        }

}
