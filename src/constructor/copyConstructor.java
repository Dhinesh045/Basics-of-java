package constructor;

public class copyConstructor {
    String name;
    int id;


    copyConstructor(String name, int id) {
        this.name = name;
        this.id = id;
    }
    copyConstructor(copyConstructor obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

class example {
    public static void main(String[] args) {
        System.out.println("First Object");
        copyConstructor obj = new copyConstructor("dhinesh", 70);
        System.out.println("Name :" + obj.name
                + " and id :" + obj.id);

        System.out.println();
        copyConstructor obj2 = new copyConstructor(obj);
        System.out.println(
                "Copy Constructor used Second Object");
        System.out.println("Name :" + obj2.name
                + " and id :" + obj2.id);
    }
}

