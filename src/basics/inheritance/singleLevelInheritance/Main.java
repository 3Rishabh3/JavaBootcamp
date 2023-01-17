package basics.inheritance.singleLevelInheritance;

public class Main {
    public static void main (String[] args){
        int n1 = 5, n2 = 2;
        ScientificCalculator obj = new ScientificCalculator();

        // Functionality of Calculator
        int addition = obj.add(n1, n2);
        int subtraction = obj.sub(n1, n2);
        int multiplication = obj.multi(n1, n2);
        int division = obj.div(n1, n2);

        // Functionality of Advanced Calculator
        double power = obj.power(n1, n2);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Power: " + power);
    }
}
