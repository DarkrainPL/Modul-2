import java.util.Scanner;

public class Zadanie4 {


    public void christmasTree() {

        int a;
        String g = "*";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);

        if (a > 0) {
            for (int i = 0; i < a; i++) {
                System.out.println(g);
                g = g + "*";
            }
        } else {
            System.out.println("Liczba mniejsza lub równa 0!");
            return;
        }


    }
}
