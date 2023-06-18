import java.util.Scanner;

public class ArrIguales {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tam, i = 0;

        System.out.println("\t.:COMPARATIVA DE VECTORES:.\n");
        System.out.print("Tamaño del vector: ");
        tam = t.nextInt();
        int [] arreglo1 = new int[tam];
        int [] arreglo2 = new int[tam];

        System.out.println("\nRellene el arreglo 1");
        lecturaArreglo(arreglo1, i);
        System.out.println("\nRellene el arreglo 2");
        lecturaArreglo(arreglo2, i);

        if (arreglosIguales(arreglo1, arreglo2, i) == false) {
            System.out.println("\nLos arreglos NO son iguales");
            impresionArreglo(arreglo1, i);
            System.out.println();
            impresionArreglo(arreglo2, i);
        } else {
            System.out.println("\nLos arreglos son iguales");
            impresionArreglo(arreglo1, i);
            System.out.println();
            impresionArreglo(arreglo2, i);
        }

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

    private static boolean arreglosIguales(int[] arreglo1, int[] arreglo2, int i) {
        if (i == arreglo1.length) {
            return true;
        } else if (arreglo1[i] != arreglo2[i]) {
            return false;
        } else {
            return arreglosIguales(arreglo1, arreglo2, i + 1);
        }
    }
}
