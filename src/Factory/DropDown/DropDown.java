package Factory.DropDown;

public abstract class DropDown {
    String format;
    int size;

    public DropDown(String format, int size) {
        this.format = format;
        this.size = size;
    }

    public abstract void setFormat();
    public abstract void setSize();
}
