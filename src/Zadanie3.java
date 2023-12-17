import java.util.Scanner;

public class Zadanie3 {

    public int smallestNumberOfFive() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int smallest;

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
        System.out.println("Input Fourth Number:");
        input = scanner.nextLine();
        d = Integer.parseInt(input);
        System.out.println("Input Fifth Number:");
        input = scanner.nextLine();
        e = Integer.parseInt(input);

        smallest = a;

        if (smallest > b) {
            smallest = b;
        } else {
            smallest = a;
        }
        System.out.println("check: " + smallest);

        if (smallest > c) {
            smallest = c;
        } else {
            smallest = smallest;
        }
        System.out.println("check: " + smallest);
        if (smallest > d) {
            smallest = d;
        } else {
            smallest = smallest;
        }
        System.out.println("check: " + smallest);
        if (smallest > e) {
            smallest = e;
        } else {
            smallest = smallest;
        }
        System.out.println("check: " + smallest);

        return smallest;
    }


}
