package isp.satisfaction;

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print();
        allInOnePrinter.scan();
        allInOnePrinter.fax();

        System.out.println();

        EconomicPrinter economicPrinter = new EconomicPrinter();
        economicPrinter.print();
    }
}
