public class dataTypes {
    public static void main(String[] args) {
        data_types_short();
        data_type_byte();
        data_types_long();
        data_types_int();
    }

    public static void data_types_int() {


//    The int type in Java can be used to represent any whole number from -2147483648 to 2147483647
        int i1 = 5;
        int i2 = 10;
        int i3 = -2147483648;
        int i4 = 2147483647;
        int i5 = -9;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
    public static void data_types_short() {
//        The short data type represents a 16-bit signed integer. It can store whole numbers within the range of approximately -32,768 to +32,767.

        short s1=3;
        short s2=-2;
        short s3=-32768;
        short s4= 32767;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }

    public static void data_type_byte() {
//        The byte data type represents an 8-bit signed integer. It can store whole numbers within the range of -128 to +127.
           byte b1=-128;
           byte b2=127;
        System.out.println(b1);
        System.out.println(b2);
    }

    public static void data_types_long() {
//        The long data type represents a 64-bit signed integer. It can store larger whole numbers than int. The range is approximately -9 quintillion to +9 quintillion.
           long l1=	-9223372036854775808L;
           long l2= 9223372036854775807L;
        System.out.println(l1);
        System.out.println(l2);
    }
}
