import java.util.Scanner;

public class PyramidExaple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int szam = scanner.nextInt();
        
        for (int i = 1; i <= szam; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
