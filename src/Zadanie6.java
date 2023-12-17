import java.util.Scanner;

public class Zadanie6 {
    public int sumOfNumbers() {
        int a;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive number:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);
        System.out.println("Your number is " + a);

        if (a >= 0) {
            for (int i = 0; i <= a; i++) {
                suma = suma + i;
            }
        } else {
            System.out.println("You have inputted a negative number");
        }

        return suma;

    }
}
