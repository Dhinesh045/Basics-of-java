public class operators {
    public static void main(String[] args) {
        assignmentOperator();
        arithmaticOperator();
        relationalOperator();
        logicalOperator();
    }

    public static void assignmentOperator() {
        //        Assignment operator
        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);

    }

    public static void arithmaticOperator() {

        System.out.println(10*10/5+3-1*4/2);
            }

    public static void relationalOperator() {
       boolean b1= (1==1);  //paranthesis are optional
        boolean b2= (1!=2);
        System.out.println(b2);
        System.out.println(b1);

    }

    public static void logicalOperator() {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&) example
        boolean resultAnd = a && b; // false
        System.out.println("a && b: " + resultAnd);

        // Logical OR (||) example
        boolean resultOr = a || b; // true
        System.out.println("a || b: " + resultOr);

        // Logical NOT (!) example
        boolean resultNotA = !a; // false
        boolean resultNotB = !b; // true
        System.out.println("!a: " + resultNotA);
        System.out.println("!b: " + resultNotB);

        // Combining logical operators
        boolean resultCombined = (a && b) || (a || !b); // true
        System.out.println("(a && b) || (a || !b): " + resultCombined);
    }
}



