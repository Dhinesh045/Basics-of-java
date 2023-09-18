package InnerClass;

public class first {

    void value(){
        System.out.println("dhinesh");
    }
        class second{
            void value1(){
                System.out.println("deepak");
            }
        }

    public static void main(String[] args) {

        first in1=new first();
        in1.value();

        first.second in=new first().new second();
        in.value1();

    }
}
