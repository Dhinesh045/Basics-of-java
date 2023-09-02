public class incrementDecrement {
    public static void main(String[] args) {
     postIncrement();
     preIncrement();
     postDecrement();
     preDecrement();
    }

    public static void postIncrement() {
        //      Post increment
        int i1=1;
        int i2=3;
        int i3=i1++ +i2;
        int i4=i1+i2;
        System.out.println(i3);
        System.out.println(i4);

    }
    public static void preIncrement() {
        int p1=4;
        int p2=5;
        int p3=++p1+p2;
        System.out.println(p3);

    }

    public static void postDecrement() {
        int l1=10;
        int l2=20;
        int l3=l1-- +l2;
        int l4=l1+ l2;
        System.out.println(l3);
        System.out.println(l4);

    }
    public static void preDecrement(){
        int d1=5;
        int d2=6;
        int d3=--d1+ d2;
        System.out.println(d3);

    }
}
