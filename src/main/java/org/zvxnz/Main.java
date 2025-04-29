package org.zvxnz;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graphics graphics = new Graphics();
        graphics.printGraphic("loadingScreen");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.err);
        }
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> taskManager = new ArrayList<>();
        ArrayList<Boolean> taskStatus = new ArrayList<>();
        int choice;
        int ifSwitch;

        do{
            System.out.println("\n----- Task Manager -----:");
            System.out.println("1. Add a task ");
            System.out.println("2. Remove a task ");
            System.out.println("3. Change task status ");
            System.out.println("4. Check task list ");
            System.out.println("5. Exit ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("=== Adding a task ===");
                    System.out.println("Choose the task's name: ");
                    String taskName = scanner.nextLine();
                    taskManager.add(taskName);
                    taskStatus.add(false);
                    break;
                case 2:
                    System.out.println("=== Removing a task ===");
                    System.out.println("Choose the task's index: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 0 && removeIndex < taskManager.size()) {
                        taskManager.remove(removeIndex);
                        taskStatus.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 3:
                    System.out.println("=== Changing task status ===");
                    System.out.println("Choose the task's index to be changed ");
                    int switchIndex = scanner.nextInt();
                    if (switchIndex >= 0 && switchIndex < taskManager.size()) {
                        System.out.println("The task: " + taskManager.get(switchIndex) + " is currently set to " + (new Check(taskStatus.get(switchIndex)) + "\nDo you want to change it?\n1 - yes\n2 - no\n"));
                        ifSwitch = scanner.nextInt();
                        scanner.nextLine();
                        switch (ifSwitch) {
                            case 2:
                                taskStatus.set(switchIndex, false);
                                break;
                            case 1:
                                taskStatus.set(switchIndex, true);
                                break;
                            default:
                                System.out.println("There is no such option.");
                        }
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 4:
                    System.out.println("=== Printing the list ===");
                    if (taskManager.isEmpty()) {
                        System.out.println("There are no tasks in this list");
                    } else {
                        for (int i = 0; i < taskManager.size(); i++) {
                            System.out.println(i + ". " + taskManager.get(i) + ", " + new Check(taskStatus.get(i)));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("There is no such option.");
            }
        } while (choice != 5);
    }
}