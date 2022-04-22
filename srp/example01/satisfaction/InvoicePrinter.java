package srp.example01.satisfaction;

public class InvoicePrinter implements Printer{
    private Invoice invoice;
    private Calculator invoiceCalculator;

    public InvoicePrinter(Invoice invoice, Calculator invoiceCalculator) {
        this.invoice = invoice;
        this.invoiceCalculator = invoiceCalculator;
    }

    @Override
    public void print() {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getPrice() + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoiceCalculator.calculate());
    }
}
