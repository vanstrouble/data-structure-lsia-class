import java.util.Scanner;

public class PosArreglo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int tam, i = 0;

        System.out.println("\t.:POSICIÓN ARREGLOS:.\n");
        System.out.print("Tamaño del vector: ");
        tam = t.nextInt();
        int [] arreglo = new int[tam];

        System.out.println("\nRellene el arreglo 1");
        lecturaArreglo(arreglo, i);

        if (pos_Arreglos(arreglo, i) == false) {
            System.out.println("\nNingún número del arreglo coincide");
        } else {
            System.out.println("\nSe encontró al menos una coincidencia");
        }
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

    private static boolean pos_Arreglos(int[] arreglo, int i) {
        if (i == arreglo.length) {
            return false;
        } else if (arreglo[i] == i) {
            System.out.println("\nEl número " + arreglo[i] + " coincide con su posición " + i);
            return true;
        } else {
            return pos_Arreglos(arreglo, i + 1);
        }
    }
}
