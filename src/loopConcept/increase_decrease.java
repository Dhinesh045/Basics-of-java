package loopConcept;

public class increase_decrease {
// increasing and decreasing order
public static void main(String[] args) {
//    increasingOrder();
    decreasingorder();
    System.out.println();
    increasingOrder();
}

    public static void increasingOrder() {
        for(int i=1;i<=100;i++){  //(int i=1;i<=100;i+=2)
            if(i%2==0){
                System.out.print(" "+i);
            }
        }
    }

    public static void decreasingorder() {
        for(int i=100;i>=1;i--){
            if(i%2==0)
            {
                System.out.print(" "+ i);
            }
        }
    }
}
