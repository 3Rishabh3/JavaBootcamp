package basics.enums;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static Day toEnum(String input) {
        return Day.valueOf(input.toUpperCase());
    }

    public static String getString(Day input) {
        return input.toString();
    }
}
public class EnumsExample2 {
    public static void main(String[] args) {
        // Convert from String to Enum
        String inputString = "Monday";
        Day outputEnum = Day.toEnum(inputString);
        System.out.println("Input String: " + inputString);
        System.out.println("Output Enum: " + outputEnum);

        // Convert from Enum to String
        Day inputEnum = Day.MONDAY;
        String outputString = Day.getString(inputEnum);
        System.out.println("\nInput Enum: " + inputEnum);
        System.out.println("Output String: " + outputString);
    }
}

