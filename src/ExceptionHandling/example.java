package ExceptionHandling;

public class example {
   public int i=50;
   public int j=4;

    public static void main(String[] args) {
        example ex=new example();
        try {
            int i1 = ex. i/ 0;
            System.out.println(i1);
        }
        catch (Exception e){
            System.out.println("error \n"+ e);
        }
    }

}
