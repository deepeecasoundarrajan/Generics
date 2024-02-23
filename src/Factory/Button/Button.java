package Factory.Button;

public abstract class Button {
    int size;
    String shape;

    public Button(int size, String shape) {
        this.size = size;
        this.shape = shape;
    }

    public abstract void setSize();
    public abstract void setShape();

}
