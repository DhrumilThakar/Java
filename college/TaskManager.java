import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int option = getOption();
            processOption(option);
        }
    }

    public static void showMenu() {
        System.out.println("TASK MANAGER");
        System.out.println("1. CREATE NEW TASK");
        System.out.println("2. VIEW TASKS");
        System.out.println("3. MODIFY TASK");
        System.out.println("4. REMOVE TASK");
        System.out.println("5. QUIT");
    }

    public static int getOption() {
        System.out.print("ENTER YOUR OPTION: ");
        return input.nextInt();
    }

    public static void processOption(int option) {
        switch (option) {
            case 1 -> createTask();
            case 2 -> viewTasks();
            case 3 -> modifyTask();
            case 4 -> removeTask();
            case 5 -> System.exit(0);
            default -> System.out.println("INVALID OPTION. PLEASE TRY AGAIN.");
        }
    }

    public static void createTask() {
        System.out.print("ENTER NEW TASK: ");
        String task = input.next();
        tasks.add(task);
        System.out.println("TASK CREATED SUCCESSFULLY!");
    }

    public static void viewTasks() {
        System.out.println("TASK LIST:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void modifyTask() {
        System.out.print("ENTER TASK NUMBER TO MODIFY: ");
        int taskNumber = input.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            System.out.print("ENTER NEW TASK: ");
            String newTask = input.next();
            tasks.set(taskNumber - 1, newTask);
            System.out.println("TASK MODIFIED SUCCESSFULLY!");
        } else {
            System.out.println("INVALID TASK NUMBER.");
        }
    }

    public static void removeTask() {
        System.out.print("ENTER TASK NUMBER TO REMOVE: ");
        int taskNumber = input.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("TASK REMOVED SUCCESSFULLY!");
        } else {
            System.out.println("INVALID TASK NUMBER.");
        }
    }
}