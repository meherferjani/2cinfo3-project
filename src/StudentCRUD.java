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

    // Read operation
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // If student with given id is not found
    }

    // Update operation
    public void updateStudent(int id, String newName, int newAge) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                return;
            }
        }
        // If student with given id is not found, you can throw an exception or handle it as you want
        // For simplicity, let's just print a message
        System.out.println("Student with ID " + id + " not found.");
    }

    // Delete operation
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    // Retrieve all students
    public List<Student> getAllStudents() {
        return students;
    }

    // Main method for testing the StudentCRUD class
    public static void main(String[] args) {
        StudentCRUD studentCRUD = new StudentCRUD();

        // Create operation
        studentCRUD.addStudent(new Student(1, "John", 20));
        studentCRUD.addStudent(new Student(2, "Alice", 22));

        // Read operation
        Student student = studentCRUD.getStudentById(1);
        if (student != null) {
            System.out.println("Student found: " + student.getName());
        } else {
            System.out.println("Student not found.");
        }

        // Update operation
        studentCRUD.updateStudent(1, "John Doe", 21);

        // Delete operation
        studentCRUD.deleteStudent(2);
       
        // Retrieve all students
        List<Student> allStudents = studentCRUD.getAllStudents();
        System.out.println("All students:");
        for (Student s : allStudents) {
            System.out.println(s.getName() + " - " + s.getAge());
        }
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
