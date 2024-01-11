import java.util.function.Predicate;
public class lambda {

    public static void main(String[] args){
        Predicate<String> largerthan5 = s -> s.length() >5;
        boolean result=largerthan5.test("dhinesh");
        System.out.println(result);
    }
}
