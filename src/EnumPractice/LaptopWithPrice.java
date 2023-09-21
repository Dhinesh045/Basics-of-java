package EnumPractice;

public enum LaptopWithPrice {
    Macbook(1000), Asus, Dell(1000);
private int price;
    private LaptopWithPrice(int price) {
        this.price=price;
        System.out.println(this.name());

    }

    LaptopWithPrice() {
        price=300000;
    }

    public static void main(String[] args) {
//        LaptopWithPrice lap=LaptopWithPrice.Asus;
//        System.out.println(lap+" "+ lap.price);

        for(LaptopWithPrice s : LaptopWithPrice.values() ){
            System.out.println(s+ " "+ s.price+" "+s.ordinal());
        }
    }
}

