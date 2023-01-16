package Basics;

public class StringBufferInJava {
    public static void main(String[] args){
        // String buffer will give you a buffer size which is of 16 byte.
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity()); //16
        System.out.println(sb.length()); //0

        StringBuffer sb2 = new StringBuffer("Rishabh");
        System.out.println(sb2.substring(2,4));
        String newName = sb2.toString(); //Convert StringBuffer to String.
    }
}
