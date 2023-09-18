package DynamicMethods;

public class getValue {
    public static void main(String[] args) {
        method1 calling = new method1();
        calling.firstClass();
        method1 calling1 =new method2();
        calling1.firstClass();
        method1 calling2=new method3();
        calling2.firstClass();


    }
}
