public class methodEx1 {
    public static void main(String[] args) {
primeBetween(15,30);
    }

    public static boolean prime(int n) {
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;

            return true;
        }

    public static void primeBetween(int start,int end) {
        for(int i=start;i<=end;i++)
            if(prime(i))
            System.out.println(i+" prime");

    }
}
