package Overloading;

public class example {
    int i1=40;
    int i2=30;
    int i3=40;
    public void  value(int val1,int val2,int val3) {
        this.i1 = val1;
        this.i2 = val2;
        this.i3 = val3;
        System.out.println(val1+val2+val3);

    }
    void value(int v1, int v2){
        this.i1=v1;
        this.i2=v2;
        System.out.println(v1+v2);
    }

}
