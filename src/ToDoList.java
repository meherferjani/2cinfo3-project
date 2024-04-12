import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> todos;

    public ToDoList() {
        todos = new ArrayList<>();
    }
    
    public void displayTodos() {
        if (todos.isEmpty()) {
            System.out.println("No todos found.");
        } else {
            System.out.println("Todos:");
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
    }

    public static void main(String[] args) {
    	   ToDoList todoList = new ToDoList();
           Scanner scanner = new Scanner(System.in);

           while (true) {
               System.out.println("\nMenu:");
               System.out.println("1. Display all todos");
               System.out.println("2. Exit");
               System.out.print("Enter your choice: ");
               int choice = scanner.nextInt();
               scanner.nextLine(); // Consume newline

               switch (choice) {
                   case 1:
                       todoList.displayTodos();
                       break;
                   case 2:
                       System.out.println("Exiting...");
                       System.exit(0);
                   default:
                       System.out.println("Invalid choice. Please choose again.");
               }
           }
    }
}