/*
 * Student Name: Shaylyn Sookan
 * Student Number: ST10295211
 * Module Code: PROG6112
 * Assessment: Practical Test 1
 * Reference: Farrell, J. 2019. Java Programming. 9th ed. Boston: Cengage Learning.
 */

public class ConsoleSales extends Console {

    // Constructor calling superclass
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report method
    public void printReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*****************************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("*****************************************");
    }
}
