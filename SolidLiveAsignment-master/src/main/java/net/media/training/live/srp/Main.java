package net.media.training.live.srp;

public class Main {
    public static void main(String[] args) {
        int[] leavesLeftPreviously = {5, 7, 2}; // example data
        Employee employee = new Employee(1, 5000, "John Doe", "123 Street", "City", "Country", 5, leavesLeftPreviously);

        HTMLPrinter printer = new HTMLPrinter();

        String htmlReport = printer.printHTML(employee);
        System.out.println(htmlReport);
    }
}
