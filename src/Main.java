import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("====== Task Manager ======\n" +
                    "1. Add Task\n" +
                    "2. Remove Task\n" +
                    "3. Mark task as completed\n" +
                    "4. Show all tasks\n" +
                    "5. Remove all completed tasks\n" +
                    "6. Exit\n" +
                    "Choose your option:");
            try {
                int number = scanner.nextInt();
                scanner.nextLine();
            switch (number){
                case 1: {
                    System.out.println("Write your description");
                    String descr = scanner.nextLine();
                    taskManager.addTask(descr);
                    break;
                }
                case 2: {
                    System.out.println("Write id for task to remove");
                    int idToRemove = scanner.nextInt();
                    taskManager.removeTask(idToRemove);
                    break;
                }
                case 3:{
                    System.out.println("Write id for task to complete");
                    int idToCompleteTask = scanner.nextInt();
                    taskManager.completeTask(idToCompleteTask);
                    break;
                }
                case 4:{
                    taskManager.listTasks();
                    break;
                }
                case 5:{
                    System.out.println("Are you sure to remove all completed tasks?");
                    String response = scanner.nextLine();
                    if (response.equalsIgnoreCase("Y")){
                        taskManager.clearCompletedTasks();
                    }
                    break;
                }
                case 6:{
                    System.out.println("Goodbye!");
                    return;
                }
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number from 1 to 6.");
                scanner.nextLine();
            }

        }

    }
}