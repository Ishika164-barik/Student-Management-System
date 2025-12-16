public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private String course;
    private double marks;

    public Student(int id, String name, int age, String address, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address=address;
        this.course=course;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Address: " + address +
                ", Course: " + course +
                ", Marks: " + marks;
    }
}



