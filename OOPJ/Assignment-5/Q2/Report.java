public class Report {

    // Generic Method
    public static <T> void generateReport(T[] data) {
        System.out.println("----- Report -----");

        for (T item : data) {
            System.out.println(item);
        }

        System.out.println("------------------");
    }
}