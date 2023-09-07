public class methodCalling

 {
    public static void main(String[] args) {
        int i=1;
        increment(i);
        System.out.println(i);
    }

    public static int increment(int i) {
        i++;
        System.out.println(i);
        return i;
    }
}

