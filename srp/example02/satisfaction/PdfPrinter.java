package srp.example02.satisfaction;

public class PdfPrinter implements Printer {
    @Override
    public void print(Article article) {
        System.out.println(article.getTitle() + " printed as PDF");
    }
}
