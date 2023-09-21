package EnumPractice;

public enum Status {
    running,failed,winning,outOfTournament;

    public static void main(String[] args) {
        Status[] ss=Status.values();
        for(Status s : ss ){
            System.out.println(s+" "+s.ordinal());
        }

    }

}


