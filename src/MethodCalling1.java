public class MethodCalling1 {
    public static void main(String[] args) {
        MethodCalling1 amount=new MethodCalling1();
        String str=amount.penValue(4);
        System.out.println(str);
        amount.num(101);


    }
    public void num(int score){
        if(score>=100)
        System.out.println("its Hundred");
        else
            System.out.println("Not Hundred");

    }
    public String penValue(int cost){
        if(cost>=7){
            return "pen";
        }
        else
            return "nothing";
    }
}
