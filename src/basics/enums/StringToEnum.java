package basics.enums;

enum Color {
    RED, GREEN, BLUE;
}
public class StringToEnum {
        public static void main(String[] args) {
        String input = "GREEN";
        Color color = Color.valueOf(input);
        System.out.println(color);
    }
}
