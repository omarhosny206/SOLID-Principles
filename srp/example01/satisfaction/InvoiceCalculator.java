package srp.example01.satisfaction;

public class InvoiceCalculator implements Calculator {
    private Invoice invoice;

    public InvoiceCalculator(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public double calculate() {
        double price = ((invoice.getBook().getPrice() - invoice.getBook().getPrice() * invoice.getDiscountRate()) * invoice.getQuantity());

        double priceWithTaxes = price * (1 + invoice.getTaxRate());

        return priceWithTaxes;
    }
}
