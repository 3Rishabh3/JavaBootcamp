package basics.enums;

import java.util.Scanner;

enum Color {
    RED, GREEN, BLUE;
}
public class StringToEnum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean match = false;
            while (!match) {
                System.out.println("Enter Colour Name: ");
                String colorName = scanner.nextLine();
                try {
                    Color.valueOf(colorName.toUpperCase());
                    System.out.println("Match success: " + colorName);
                    match = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Color name not matched.");
                    System.out.println("Plz enter correct Color name");
                }
            }
    }
}

