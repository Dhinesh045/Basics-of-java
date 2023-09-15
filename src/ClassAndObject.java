class valueReturn{
    public int calculator(int n1,int n2){
        int i=n1+n2;
        return i;

    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;

        valueReturn val= new valueReturn();
       int result= val.calculator(num1,num2);

        System.out.println("sum of value "+result);

    }
}
