package threads;

public class output {
    public static void main(String[] args) {
example1 ex1= new example1();
example2 ex2 = new example2();
ex1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
ex2.start();
    }
}
