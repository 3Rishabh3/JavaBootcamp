package Basics;

class Calculator {
    public int add (int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}
public class ClassesAndObjects {
    public static void main(String[] args){
        int num1 = 1, num2 = 3;

        Calculator calc = new Calculator();
        int res = calc.add(num1, num2);
        System.out.println("Result: " + res);
    }
}
