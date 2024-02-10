package DependencyInversion;

public class DatabaseManager {
    CloudDB clouddb;

    public DatabaseManager(CloudDB clouddb) {
        this.clouddb = clouddb;
    }

    public void connectdb() {
        clouddb.connect();
    }

    public void addStudent() {
        clouddb.query();
    }

    public void removeStudent() {
        clouddb.query();
    }
}
