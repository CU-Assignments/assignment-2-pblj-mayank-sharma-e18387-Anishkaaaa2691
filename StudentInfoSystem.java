abstract class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void displayDetails();
}

class Student extends Person {
    int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInfoSystem {
    public static void main(String[] args) {
        Student s = new Student("Alice", 20, 101);
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");

        s.displayDetails();
        t.displayDetails();
    }
}
