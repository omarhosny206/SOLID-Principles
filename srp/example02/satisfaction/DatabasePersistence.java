package srp.example02.satisfaction;

public class DatabasePersistence implements Persistence {
    private String databaseName;

    public DatabasePersistence(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void persist(Article article) {
        System.out.println(article.getTitle() + " persisted to Database " + databaseName);
    }
}
