package isp.violation;

public class Main {
    public static void main(String[] args) {
        Printer allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print();
        allInOnePrinter.scan();
        allInOnePrinter.fax();

        System.out.println();

        Printer economicPrinter = new EconomicPrinter();
        economicPrinter.print();
        economicPrinter.scan();
        economicPrinter.fax();
    }
}
