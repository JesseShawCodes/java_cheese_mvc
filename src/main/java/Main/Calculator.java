package Main;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String s1 = getInput("Enter Value 1: ");
        String s2 = getInput("Enter Value 2: ");
        String s3 = getInput("Choose an operation (+ - * /)");
        System.out.println(s3);

        switch (s3) {
            case "+":
                System.out.println(addValues(s1, s2));
                break;
            case "-":
                System.out.println(subValues(s1, s2));
                break;
            case "*":
                System.out.println(multValues(s1, s2));
                break;
            case "/":
                System.out.println(divValues(s1, s2));
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
        }
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static double addValues(String s1, String s2) {
        return Double.parseDouble(s1) + Double.parseDouble(s2);
    }

    private static double subValues(String s1, String s2) {
        return Double.parseDouble(s1) - Double.parseDouble(s2);
    }

    private static double multValues(String s1, String s2) {
        return Double.parseDouble(s1) * Double.parseDouble(s2);
    }

    private static double divValues(String s1, String s2) {
        return Double.parseDouble(s1) / Double.parseDouble(s2);
    }

}
