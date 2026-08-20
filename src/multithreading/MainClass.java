package multithreading;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new Thread (new World());
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
