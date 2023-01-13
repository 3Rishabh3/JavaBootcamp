package Basics;

import java.util.Scanner;

public class IfElseLoop {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        age = Integer.parseInt(sc.nextLine());

        if(age < 0)
            System.out.println("Age is not valid");
        else if (age < 18)
            System.out.println("Not eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
}
