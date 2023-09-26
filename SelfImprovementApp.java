import java.util.ArrayList;
import java.util.Scanner;

public class SelfImprovementApp {

    public static void main(String[] args) {

        // Create a new scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input their spiritual win for the day
        System.out.println("What is your spiritual win for the day?");
        String spiritualWin = scanner.nextLine();

        // Prompt the user to input their mental win for the day
        System.out.println("What is your mental win for the day?");
        String mentalWin = scanner.nextLine();

        // Prompt the user to input their physical win for the day
        System.out.println("What is your physical win for the day?");
        String physicalWin = scanner.nextLine();

        // Create a new ArrayList to store the user's checklist for the day
        ArrayList<String> checklist = new ArrayList<>();

        // Prompt the user to add items to their checklist
        System.out.println("Add items to your checklist for the day:");
        String checklistItem = scanner.nextLine();
        while (!checklistItem.equals("done")) {
            checklist.add(checklistItem);
            checklistItem = scanner.nextLine();
        }

        // Prompt the user to input something they are grateful for each day
        System.out.println("What are you grateful for today?");
        String gratitude = scanner.nextLine();

        // Prompt the user to write a daily reflection
        System.out.println("Write a daily reflection:");
        String reflection = scanner.nextLine();

        // Print the user's wins, checklist, gratitude, and reflection to the console
        System.out.println("Spiritual win: " + spiritualWin);
        System.out.println("Mental win: " + mentalWin);
        System.out.println("Physical win: " + physicalWin);
        System.out.println("Checklist: " + checklist);
        System.out.println("Gratitude: " + gratitude);
        System.out.println("Reflection: " + reflection);

        // Close the scanner
        scanner.close();
    }
}