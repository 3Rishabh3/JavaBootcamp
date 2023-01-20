package basics.collections.queueinterface.arraydeque;

import java.util.ArrayDeque;

public class Remove_3 {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using clear()
        animals.clear();

        System.out.println("New ArrayDeque: " + animals);
    }
}
