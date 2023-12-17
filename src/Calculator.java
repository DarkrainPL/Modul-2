import java.util.Scanner;

public class Calculator {

    public void start() {
        System.out.println("Welcome to the Calculator app");
        System.out.println("First you will have to choose two numbers and the operator (+,-,/,*).");
        System.out.println("To exit type 'exit' and press enter");
        System.out.println();
        String answer = "y";

        while (answer.equals("Y") || answer.equals("y")) {


            String operator = getOperationFromUser();
            float a = getNumberFromUser();
            float b = getNumberFromUser();

            if (operator.equals("+")) {
                System.out.println("Result of adding the number " + b + " to number " + a + " is: " + add(a, b));
            } else if (operator.equals("-")) {
                System.out.println("Result of subtracting the number " + b + " from " + a + " is: " + subtract(a, b));
            } else if (operator.equals("/")) {
                if (b > 0) {

                    System.out.println("Result of dividing the number " + a + " by " + b + " is: " + divide(a, b));
                } else {
                    System.out.println("Can't divide by 0!!! Application will exit now.");
                    System.exit(0);
                }
            } else if (operator.equals("*")) {
                System.out.println("Result of multiplying the number " + a + " by " + b + " is: " + multiply(a, b));
            }
            System.out.print("Would you like to make another calculation? (Y/N):");
            answer = yesOrNo();
        }
    }

    private String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input operator:");
        String input = scanner.nextLine();

        if (input.equals("+") || input.equals("-") || input.equals("/") || input.equals("*")) {
            return input;
        } else {
            System.out.println("You have chosen invalid operator! The app will exit now.");

        }
        System.exit(0);
        return "";
    }

    private float getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number:");
        String input = scanner.nextLine();
        float number = Float.parseFloat(input);
        return number;
    }

    private String yesOrNo() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y") || input.equals("n") || input.equals("Y") || input.equals("N")) {
        return input;
        } else {
            System.out.println("You have chosen invalid answer! The app will exit now.");
        }
        return input;
    }

    private float add(float a, float b) {
        return a + b;
    }

    private float subtract(float a, float b) {
        return a - b;
    }

    private float divide(float a, float b) {
        return a / b;
    }

    private float multiply(float a, float b) {
        return a * b;
    }

}