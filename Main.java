import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager service = new StudentManager();
        int choice;

        do {
            System.out.println("\n1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Delete Student");
            System.out.println("4 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("Name: ");
                String name = sc.next();

                System.out.print("Age: ");
                int age = sc.nextInt();

                System.out.print("Address: ");
                String address = sc.next();

                System.out.print("Course: ");
                String course = sc.next();

                System.out.print("Marks: ");
                double marks = sc.nextDouble();

                Student s = new Student(id, name, age, address, course, marks);
                service.addStudent(s);

            } else if (choice == 2) {
                service.viewStudents();

            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                service.deleteStudent(id);

            } else if (choice == 4) {
                System.out.println("Bye Bye");
            } else {
                System.out.println("Wrong choice");
            }

        } while (choice != 4);

        sc.close();
    }
}