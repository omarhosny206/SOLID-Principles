package srp.example02.violation;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Learn Solid Principles", "Robert C. Martin");
        String title = article.getTitle();
        String author = article.getAuthor();
        System.out.println("Article's title is " + title);
        System.out.println("Article's author is " + author);

        System.out.println();

        article.print();

        System.out.println();

        article.persistToDirectory("Articles");
    }
}
