package com.company;

import logic.Code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        ui(reader);

    }

    public static void ui(Scanner reader) {
        System.out.println("Please Enter your operation: ");
        Code calc = new Code();
        String response = reader.nextLine();
        int x;
        int y;

        while (!response.equals("quit")) {
            System.out.println("Enter your first number: ");
            x = Integer.parseInt(reader.nextLine());
            System.out.println("Enter your second number: ");
            y = Integer.parseInt(reader.nextLine());

            if (response.equals("+")) {
                System.out.println(calc.add(x,y));
            } else if (response.equals("-")) {
                System.out.println(calc.subtract(x, y));
            } else if (response.equals("*")) {
                System.out.println(calc.multiply(x, y));
            } else if (response.equals("/")) {
                System.out.println(calc.divide(x,y));
            } else {
                System.out.println("Please enter a proper operation.");
            }
            System.out.println("Please Enter your operation");
            response = reader.nextLine();

        }
        System.out.println("Thanks for using the calculator");
    }

}
