package srp.example02.violation;

public class Article {
    private String title;
    private String author;

    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void print() {
        System.out.println(title + " printed");
    }

    public void persistToDirectory(String directoryName) {
        System.out.println("Article persisted to directory " + directoryName);
    }
}
