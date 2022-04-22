package srp.example02.satisfaction;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Learn Solid Principles", "Robert C. Martin");
        String title = article.getTitle();
        String author = article.getAuthor();
        System.out.println("Article's title is " + title);
        System.out.println("Article's author is " + author);

        System.out.println();

        Printer htmlPrinter = new HtmlPrinter();
        Printer pdfPrinter = new PdfPrinter();
        Printer plainTextPrinter = new PlainTextPrinter();
        htmlPrinter.print(article);
        pdfPrinter.print(article);
        plainTextPrinter.print(article);

        System.out.println();

        Persistence databasePersistence = new DatabasePersistence("Articles.db");
        Persistence directoryPersistence = new DirectoryPersistence("Articles");
        databasePersistence.persist(article);
        directoryPersistence.persist(article);
    }
}
