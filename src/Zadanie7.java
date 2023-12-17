import java.util.Scanner;

public class Zadanie7 {

    public void fibonacci() {
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a term number:");
        String input = scanner.nextLine();
        a = Integer.parseInt(input);

        if (a >= 0) {
            int l1 = 0;
            int l2 = 1;
            int l3 = 1;

            System.out.println(l1);
            for (int i = 0; i < a; i++) {
                System.out.println(l3);
                l3 = l1 + l2;
                l1 = l2;
                l2 = l3;

            }
        } else {
            System.out.println("Inputted number is negative!");
        }
    }
}