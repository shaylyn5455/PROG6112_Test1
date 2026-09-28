/*
 * Student Name: Shaylyn Sookan
 * Student Number: ST10295211
 * Module Code: PROG6112
 * Assessment: Practical Test 1
 * Reference: Farrell, J. 2019. Java Programming. 9th ed. Boston: Cengage Learning.
 */

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display console selection menu
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = Integer.parseInt(scanner.nextLine().trim());

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "PS5";
                break;
        }

        // Prompt for Store Name
        System.out.print("Enter the store: ");
        String store = scanner.nextLine().trim();

        // Prompt for Total Sales
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");
        int totalSales = Integer.parseInt(scanner.nextLine().trim());

        // Instantiate ConsoleSales subclass
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);

        // Print final report
        report.printReport();

        scanner.close();
    }
}