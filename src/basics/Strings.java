package basics;

public class Strings {
    public static void main (String[] args){
        String fName = new String("Rishabh");
        String lName = "Gupta"; //Another way of creating string

        String fullName = fName + " " + lName;
        System.out.println("My name is: " + fullName);

        String s1 = "Rishi";
        String s2 = "Rishi";
        // Both s1 and s2 will point to same address (String constant pool)

        System.out.println(s1 == s2);

        /* Strings are immutable in nature so to make mutable string
           you can use String buffer.
        */
    }
}
