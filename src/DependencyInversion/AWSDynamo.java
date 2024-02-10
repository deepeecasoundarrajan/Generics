package DependencyInversion;

public class AWSDynamo implements CloudDB {
    public void connect() {
        System.out.println("Connecting to DB...");
    }

    public void query() {
        System.out.println("Querying db...");
    }
}
