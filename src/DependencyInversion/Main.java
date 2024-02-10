package DependencyInversion;

public class Main {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager(new GCP());

        db.connectdb();
        db.addStudent();
        db.removeStudent();
    }

}
