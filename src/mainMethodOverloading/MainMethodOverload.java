package mainMethodOverloading;

public class MainMethodOverload {
    public class MainMethodOverload2
    {
        //original main() method
        public static void main(String args[])
        {
            MainMethodOverload mmo= new MainMethodOverload ();
//calling overloaded main() method from the original main() method
            mmo.notify();
        }
        //overloaded main() method
        public static void main()
        {
            System.out.println("Overloaded main() method invoked");
        }
    }
}
