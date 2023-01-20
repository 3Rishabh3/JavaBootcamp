package basics.collections.queueinterface.arraydeque;

import java.util.ArrayDeque;

public class Adding_2 {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        // Using offer()
        animals.offer("Dog");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("Horse");
        System.out.println("ArrayDeque: " + animals);
    }
}
