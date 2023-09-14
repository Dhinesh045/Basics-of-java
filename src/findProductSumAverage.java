public class findProductSumAverage {
    public static void main(String[] args) {
        int[] index={1,2,3,4,5};
        int sum=0;
        double product =1;
        int average = 0;
        for(int i=0;i<index.length;i++){
           sum += index[i];
           product =product * index[i];

        }
        average=sum/index.length;
        
        System.out.println("sum=" +sum +" product= "+product+" average= "+average);

    }
        
}
