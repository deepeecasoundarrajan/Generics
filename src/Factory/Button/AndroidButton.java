package Factory.Button;

public class AndroidButton extends Button {
    public AndroidButton(int size, String shape) {
        super(size, shape);
    }

    public void setSize() {
        System.out.println("Size of Android button is " + this.size);
    }

    public void setShape() {
        System.out.println("Shape of Android button is " +  this.shape);
    }
}
