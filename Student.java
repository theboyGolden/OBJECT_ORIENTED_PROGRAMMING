// Create a class called Student with the following attributes and methods:

// Attributes: name (String), id (String), grade (double).
// Methods:
// displayInfo() method that prints out the information about the student, including name, ID, and grade.
// Implement a constructor for the Student class to initialize the attributes.
// Create an instance of the Student class, set some initial values, and call the displayInfo() method to print out the student details.




public class Student {
    private String name;
    private String id;
    private double grade;


    public void displayInfo(){
        System.out.println("Name of Student: " + name);
        System.out.println("Student id: " + id );
        System.out.println("Grade of Student: " + grade);
    }
    
    Student (String name, String id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public static void main (String [] args){
        Student student1 = new Student ("Golden Boy", "Gb11020678", 96.00);

        student1.displayInfo();
    }
}