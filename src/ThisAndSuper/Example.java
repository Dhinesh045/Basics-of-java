package ThisAndSuper;

public class Example {
    String color = "blue";

}

class B extends Example {
    int j;

    public void B(int value) {
        this.j = value;
        String color = "white";
        System.out.println("parent class" + super.color);
        System.out.println("sub class " + color);
    }

    public static void main(String[] args) {
        B val = new B();
        val.B(4);
    }
}

