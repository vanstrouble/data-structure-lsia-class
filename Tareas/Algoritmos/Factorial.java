import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("\t.:FACTORIAL:.\n");
        System.out.print("Digite un número: ");
        int numero = t.nextInt(); t.close();

        System.out.println("\nEl factorial del número es: " + factorial(numero));
    }

    public static long factorial (int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
