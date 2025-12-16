import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added");
    }


    public void viewStudents() {
        if (students.size() == 0) {
            System.out.println("No students");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void deleteStudent(int id) {
        Student s = findStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted");
        } else {
            System.out.println("Student not found");
        }
    }
}