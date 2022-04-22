package isp.satisfaction;

public class AllInOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void print() {
        System.out.println("I can print");
    }

    @Override
    public void scan() {
        System.out.println("I can scan");
    }

    @Override
    public void fax() {
        System.out.println("I can send fax");
    }
}
