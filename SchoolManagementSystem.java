import java.util.ArrayList;
import java.util.Scanner;

// Base class representing a person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Class representing a student
class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + getName() + ", Age: " + getAge();
    }
}

// Class representing a teacher
class Teacher extends Person {
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Department: " + department + ", Name: " + getName() + ", Age: " + getAge();
    }
}

// Base class representing a course
class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Inherited class representing a specific department (e.g., Math)
class MathDepartment extends Course {
    public MathDepartment(String courseName) {
        super(courseName);
    }
}

// Class representing a list of students
class StudentList {
    private ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.toString());
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Student removed: " + student.toString());
    }

    public void displayStudents() {
        System.out.println("\nStudents in the list:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a list to manage students
        StudentList studentList = new StudentList();

        // Taking user input for student details
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        // Creating a student object
        Student student = new Student(studentName, studentAge, studentId);

        // Adding the student to the list
        studentList.addStudent(student);

        // Displaying the list of students
        studentList.displayStudents();

        // Taking user input for teacher details
        scanner.nextLine(); // Consume the newline character
        System.out.print("\nEnter teacher name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter teacher age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter teacher department: ");
        String teacherDepartment = scanner.nextLine();

        // Creating a teacher object
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherDepartment);

        // Displaying teacher details
        System.out.println("\nTeacher details: " + teacher.toString());

        // Creating a Math Department course
        MathDepartment mathCourse = new MathDepartment("Mathematics");

        // Displaying course details
        System.out.println("\nCourse details: " + mathCourse.getCourseName());

        // Performing other operations based on the requirements of the school management system
        // ...

        // Closing the scanner
        scanner.close();
    }
}
