package isp.violation;

public class EconomicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("I can print");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("I can't scan");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("I can't send fax");
    }
}
