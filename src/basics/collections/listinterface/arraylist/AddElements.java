package basics.collections.listinterface.arraylist;

import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args){
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add() method without the index parameter
        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);
    }
}
