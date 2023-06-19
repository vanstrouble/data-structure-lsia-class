import java.util.Scanner;

/*
Ejercicio 6
6) Construya un diagrama de flujo que dados 3 números los muestre ordenados ascendentemente. 
*/

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float [] numeros = new float[3];
        float aux;

        System.out.println("\t.:ORDENAMIENTO DE 3 NÚMEROS:.\n");
        System.out.println("Ingrese los números…");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite el número " + (i + 1) + ": ");
            numeros[i] = leer.nextFloat();
        }
        leer.close();


        // Método burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("\nNúmeros de forma ascendente…");
        for (float numero : numeros) {
            System.out.print(numero + " - ");
        }
        System.out.println();
    }
}