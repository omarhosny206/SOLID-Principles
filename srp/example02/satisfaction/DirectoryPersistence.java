package srp.example02.satisfaction;

public class DirectoryPersistence implements Persistence {
    private String directoryName;

    public DirectoryPersistence(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public void persist(Article article) {
        System.out.println(article.getTitle() + " persisted to Directory " + directoryName);
    }
}
