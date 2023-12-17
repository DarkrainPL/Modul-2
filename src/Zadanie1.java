import java.util.Scanner;

public class Zadanie1 {

    public void verify() {

        int liczba;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number:");
        String input = scanner.nextLine();
        liczba = Integer.parseInt(input);

        if (liczba > 0) {
            System.out.println("This is a positive number");
        } else {
            System.out.println("This is a negative number");
        }
    }
}