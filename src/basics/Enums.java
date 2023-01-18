package basics;

enum Status {
    Running, Pending, Failed, Success;
}

public class Enums {
    public static void main(String[] args) {
        Status s = Status.Failed;
        System.out.println(s);
        Status[] st = Status.values();

        for(Status ss : st){
            System.out.println(ss + " " +ss.ordinal());
        }
    }
}
