import java.util.Scanner;

public class Zadanie5 {

    public void printingOutNumbers() {

        int a;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);

        if (a >= 0) {
            for (int i = 0; i <= a; i++) {
                System.out.println(i);

            }
        } else {
            System.out.println("Liczba mniejsza od 0!");
        }


    }
}