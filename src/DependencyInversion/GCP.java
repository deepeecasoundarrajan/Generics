package DependencyInversion;

public class GCP implements CloudDB{

    public void connect() {
        System.out.println("Making connection to db...from GCP");
    }

    public void query() {
        System.out.println("Querying from GCP...");
    }
}
