import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numero;
        System.out.print("Digite un número: ");
        numero = entry.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Número divisible entre ambos");
        } else if (numero % 2 == 0) {
            System.out.print("El número " + numero + " es divisible entre 2");
        } else if (numero % 3 == 0) {
            System.out.print("El número " + numero + " es divisible entre 3");
        } else {
            System.out.println("No es divisible entre ninguno");
        }
    }
}
