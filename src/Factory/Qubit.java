package Factory;

public class Qubit {
    String name;
    int buttonSize;
    int dropdownsize;
    String buttonShape;
    String dropformat;

    public Qubit(String name, int buttonSize, int dropdownsize, String buttonShape, String dropformat) {
        this.name = name;
        this.buttonShape = buttonShape;
        this.buttonSize = buttonSize;
        this.dropdownsize = dropdownsize;
        this.dropformat = dropformat;
    }

    public QubitFactory createFactory() {
        if(this.name == "IOS") {
            return new IosFactory(buttonSize, buttonShape, dropdownsize, dropformat);
        }
        if(this.name == "Android") {
            return new AndroidFactory(buttonSize, buttonShape, dropdownsize, dropformat);
        }
        return null;
    }
}
