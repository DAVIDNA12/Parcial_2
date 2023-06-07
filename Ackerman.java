package akerman;

/**
 *
 * @author David Nieto Ayala
 */
import java.util.Scanner;

public class Ackerman {

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero de Akerman que deseas(m)");
        int m = scanner.nextInt();

        System.out.println("Ingresa el segundo numero de Akerman que deseas(n)");
        int n = scanner.nextInt();

        int result = ackermann(m, n);
        System.out.println(" Ackermann  es (" + m + ", " + n + ") es: " + result);
    }
}
