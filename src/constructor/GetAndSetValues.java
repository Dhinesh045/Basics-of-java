package constructor;

public class GetAndSetValues {
    public static void main(String[] args) {
        GetterSetter value= new GetterSetter();
        value.setid(45);
        value.setname("dhinesh");
        value.setsalary(5);
        int i=value.getid();
        String str=value.getname();
        float f=value.getsalary();
        System.out.println("id is "+" "+i+" and name is "+str+" and salary is "+f);

    }
}
