package ExceptionHandling;

public class Main {
    public static void main(String[] args)  {


        try {
            demoException(5);
            demoException(0);
        } catch(DemoException e) {
            System.out.println("Catching gracefully");
        }

    }

    public static void demoException(int x) throws DemoException {
        if(x == 0) {
            throw new DemoException();
        }
        else {
            System.out.println(x + 1);
        }
    }
}
