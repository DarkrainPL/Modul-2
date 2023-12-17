import java.util.Scanner;

public class Zadanie8 {

    public void silnia() {

        int a;
        int suma = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a natural number > 0:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);

        if (a > 0) {
            for (int i = 1; i <= a; i++) {

                suma = suma * i;
            }
        } else {
            System.out.println("You have inputted a negative number or 0");
        }
        System.out.println(suma);
    }
}
