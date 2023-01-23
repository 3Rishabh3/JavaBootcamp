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

        // TODO Convert string to enum
        String str = "Running";
        // Cover corner cases also: if u get empty string then handle it
        // TODO Convert enum value to string
    }
}


