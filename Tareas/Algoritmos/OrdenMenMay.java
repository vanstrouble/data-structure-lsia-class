import java.util.Arrays;
import java.util.Scanner;

/**
 * Orden de menor a mayor
 * Escriba una función recursiva que ordene de menor a mayor un arreglo de enteros basándose 
 * en la siguiente idea: coloque el elemento más pequeño en la primera ubicación, y luego ordene 
 * el resto del arreglo con una llamada recursiva.
 */
public class OrdenMenMay {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tam, i = 0;
        

        System.out.println("\t.:ORDENAMIENTO RECURSIVO:.\n");
        System.out.print("Tamaño del vector: ");
        tam = t.nextInt();
        int [] numeros = new int[tam];
        System.out.println();

        lecturaArreglo(numeros, i);

        System.out.println("\n-------------------------");
        System.out.println("Mostrando arreglo original\n");

        impresionArreglo(numeros, i);

        System.out.println();

        metodoBurbuja(numeros, numeros.length);

        System.out.println("\n-------------------------");
        System.out.println("Mostrando arreglo ordenado\n");

        System.out.println(Arrays.toString(numeros));

        System.out.println();
    }

    private static void lecturaArreglo(int[] datos, int i) {
        if (datos.length == i) {
            return;
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite el numero (" + (i + 1) + "): ");
            datos[i] = scan.nextInt();
            lecturaArreglo(datos, i + 1);
        }
    }

    private static void impresionArreglo(int[] datos, int i) {
        if (datos.length == i) {
            return;
        } else {
            System.out.printf(" %d", datos[i]);
            impresionArreglo(datos, i + 1);
        }
    }

    private static void metodoBurbuja(int arreglo[], int n) {
        if (n == 1) {
            return;
        } else {
            for (int i = 0; i < n - 1; i++){
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = temp;
                }
            }
            metodoBurbuja(arreglo, n - 1);
        }
    }
}