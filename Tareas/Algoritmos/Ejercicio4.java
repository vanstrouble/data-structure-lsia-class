import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        float numero, cuadrado;

        System.out.print("Digite un número: ");
        numero = entry.nextInt();

        cuadrado = (float) Math.pow(numero, 2);

        if (cuadrado > numero) {
            System.out.println("El resultado de la operación es mayor que el valor original");
        } else {
            System.out.println("El resultado de la operación NO es mayor que el valor original");
        }
    }
}
