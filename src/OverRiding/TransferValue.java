package OverRiding;

public class TransferValue {
    public static void main(String[] args) {
        Adcalc calc=new Adcalc();
        int i=calc.add(3,4);
        System.out.println(i);
        Calc cal=new Calc();
        int n2=cal.add(3,4);
        System.out.println(n2);
    }
}
