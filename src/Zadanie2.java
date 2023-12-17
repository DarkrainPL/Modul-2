import java.util.Scanner;

// & - ampersand
public class Zadanie2 {

    public int averageOfThree() {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input First Number:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);
        System.out.println("Input Second Number:");
        input = scanner.nextLine();
        b = Integer.parseInt(input);
        System.out.println("Input Third Number:");
        input = scanner.nextLine();
        c = Integer.parseInt(input);

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("This are a positive numbers");
        } else {
            System.out.println("One of them is a negative number");
        }

        int result = (a + b + c) / 3;
        return result;
    }
}
