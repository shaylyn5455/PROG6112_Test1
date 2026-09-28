/*
 * Student Name: Shaylyn Sookan
 * Student Number: ST10295211
 * Module Code: PROG6112
 * Assessment: Practical Test 1
 * Reference: Farrell, J. 2019. Java Programming. 9th ed. Boston: Cengage Learning.
 */

public abstract class Console implements iConsole {

    // Instance variables
    private String consoleType;
    private String store;
    private int totalSales;

    // Parameterised constructor
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getter methods
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
