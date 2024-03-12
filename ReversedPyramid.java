import java.util.Scanner;

public class ReversedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int szam = scanner.nextInt();

        for (int i = szam; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
