package EnumPractice;

public enum SwitchEnum {
    apple,banana,orange;

    public static void main(String[] args) {
        SwitchEnum s= SwitchEnum.banana;
        switch (s){
            case apple -> System.out.println("its apple");
            case banana -> System.out.println("its banana");
            case orange -> System.out.println("its ornage");

        }

    }
}

