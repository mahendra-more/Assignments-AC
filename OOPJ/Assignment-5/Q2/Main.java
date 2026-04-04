public class Main {
    public static void main(String[] args) {

        // Sales Figures (Double)
        Double[] sales = {1000.5, 2000.75, 1500.25};
        Report.generateReport(sales);

        // Employee Names (String)
        String[] names = {"Rahul", "Amit", "Sneha"};
        Report.generateReport(names);

        // Product IDs (Integer)
        Integer[] productIds = {101, 102, 103};
        Report.generateReport(productIds);
    }
}