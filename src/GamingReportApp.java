/*
 * Student Name: Shaylyn Sookan
 * Student Number: ST10295211
 * Module Code: PROG6112
 * Assessment: Practical Test 1
 * Reference: Farrell, J. 2019. Java Programming. 9th ed. Boston: Cengage Learning.
 */

public class GamingReportApp {

    public static void main(String[] args) {
        // 1. Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // 2. Single-dimensional array for console types
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 3. Two-dimensional array for sales data [city][console]
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display Header
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");

        // Display Column Headers
        System.out.printf("%-16s %-10s %-10s %-10s%n", "", consoles[0], consoles[1], consoles[2]);

        // Display Sales Data Table
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-16s %-10d %-10d %-10d%n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        // Calculate and Display Totals for each city
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-16s %d%n", cities[i], cityTotal);

            // Determine city with the most sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }
}
