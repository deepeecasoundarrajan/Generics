package Factory.DropDown;

public class IosDropDown extends DropDown {
    public IosDropDown(String format, int size) {
        super(format, size);
    }

    public void setFormat() {
        System.out.println("The format of dropdown for IOS is " + this.format);
    }

    public void setSize() {
        System.out.println("The size of dropdown for IOS " + this.size);
    }
}
