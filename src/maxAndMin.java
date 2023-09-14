public class maxAndMin {
    public static void main(String[] args) {
        int[] index={3,4,5,1,-1,9};
        int max=index[0];
        int min=index[0];
        for(int i=0;i<index.length;i++){
             max=index[i]>max ? index[i] : max;
             min=index[i]<min ? index[i] : min;


        }
        System.out.println("maximum value is "+max+" minimum value is "+min);
    }
}
