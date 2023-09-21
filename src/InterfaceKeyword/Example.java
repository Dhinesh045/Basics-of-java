package InterfaceKeyword;

public class Example {
    public static void main(String[] args) {
        Implement imp=new Implement();
        imp.school();
        imp.school2();
        System.out.println(Interface.sc);
        System.out.println(Interface.i);

    }

}
interface Interface {
    String sc= "dhinesh";
    int i=45;
    void school();
    void school2();

}
class Implement implements Interface{

    @Override
    public void school() {
        System.out.println("dhineshKumar");
    }

    @Override
    public void school2() {
        System.out.println("DeepakRanjith");

    }
}
