package inheritanceConcept;

public class TransferValue
{
    public static void main(String[] args) {
        Calc calculator=new Calc();
        int add=calculator.add(2,4);
        int sub=calculator.sub(4,1);
        int multiply=calculator.multiply(3,6);
        int divide=calculator.divide(100,10);
        System.out.println(add+" "+sub+" "+multiply+" "+divide);

    }





}
