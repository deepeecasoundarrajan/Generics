package Factory.Button;

public class IosButton extends Button{
    public IosButton(int size, String shape) {
        super(size, shape);
    }

    public void setSize() {
        System.out.println("Size of IOS button is  " +  this.size);
    }

    public void setShape() {
        System.out.println("Shape of IOS button is " + this.shape);
    }
}
