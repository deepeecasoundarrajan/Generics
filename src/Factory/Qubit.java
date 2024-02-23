package Factory;

public class Qubit {
    String name;

    public Qubit(String name) {
        this.name = name;
    }

    public QubitFactory createFactory() {
        if(this.name == "IOS") {
            return new IosFactory();
        }
        if(this.name == "Android") {
            return new AndroidFactory();
        }
        return null;
    }
}
