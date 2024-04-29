import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordsApp  extends GradeProcessor {
    private LinkedList<Student> students;
    private GradeProcessor gradeProcessor;
    private Scanner scanner;

    public StudentRecordsApp(){
        students = new LinkedList<>();
       // gradeProcessor = new GradeProcessor();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Student Records App!");
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Process Grades");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    processGrades();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using Student Records App!");
    }

    private void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        students.add(new Student(name, age));
        System.out.println("Student added successfully!");
    }

    private void processGrades() {
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        char grade = calculateLetterGrade(score);
        System.out.println("Grade: " + grade);
    }

    private void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Students:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
}
// ask Mrs.Diekhoff to see if your program is right and ask about the lab as well