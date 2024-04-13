import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {

    private List<Student> students;

    public StudentCRUD() {
        students = new ArrayList<>();
    }

    // Create operation
    public void addStudent(Student student) {
        students.add(student);
    }


   
    // Main method for testing the StudentCRUD class
    public static void main(String[] args) {
        StudentCRUD studentCRUD = new StudentCRUD();

        // Create operation
        studentCRUD.addStudent(new Student(1, "John", 20));
        studentCRUD.addStudent(new Student(2, "Alice", 22));

        
       
       
    }
}

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
