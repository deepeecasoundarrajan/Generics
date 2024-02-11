package Singleton;

public class Main {
    public static void main(String[] args) {
        MultithreadSingleton obj1 = MultithreadSingleton.getInstance();
        MultithreadSingleton obj2 = MultithreadSingleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(EagerSingleton.getInstance());
    }
}
