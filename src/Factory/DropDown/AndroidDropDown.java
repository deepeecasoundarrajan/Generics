package Factory.DropDown;

public class AndroidDropDown extends DropDown {
    public AndroidDropDown(String format, int size) {
        super(format, size);
    }

    public void setFormat() {
        System.out.println("The format of dropdown for Android is " + this.format);
    }

    public void setSize() {
        System.out.println("The size of dropdown for Android " + this.size);
    }
}
