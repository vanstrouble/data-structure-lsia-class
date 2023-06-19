import java.util.Arrays;
import java.util.Scanner;

/**
 * SumaArreglos
 * C) Escriba una función recursiva la cual reciba dos arreglos de números enteros y regrese un tercer arreglo 
 * del mismo tamaño el cual contiene la suma de los valores elemento a elemento originales.

    Ejemplo:

    Arreglo A = 2 3 4 5
    Arreglo B = 1 2 1 2
    respuesta = 3 5 5 7
 */
public class SumaArreglos {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int tam;
        System.out.println("\t.:SUMA DE ARREGLOS:.\n");
        System.out.println("-----------------------------------\n");
        System.out.print("Digite el tamaño de los arreglos: ");
        tam = t.nextInt();

        System.out.println("\n-----------------------------------");
        
        int[] arreglo1 = new int[tam];
        int[] arreglo2 = new int[tam];
        var arreglo3 = new int[arreglo1.length];
        

        System.out.println("\nIngrese datos del arreglo 1");
        lecturaArreglo(arreglo1, 0);
        System.out.println("\nIngrese datos del arreglo 2");
        lecturaArreglo(arreglo2, 0);

        int[] resultado = sumaArreglo(arreglo1, arreglo2, arreglo3, 0);

        System.out.println("\n--------------------");
        System.out.println("Mostrando arreglos a sumar\n");

        impresionArreglo(arreglo1, 0);
        System.out.println();
        impresionArreglo(arreglo2, 0);
        System.out.println();

        System.out.println("\n--------------------");
        System.out.println("Mostrando arreglo de la suma\n");
        System.out.println(Arrays.toString(resultado));
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

    private static int[] sumaArreglo(int[] arreglo1, int[] arreglo2, int[] arreglo3, int i) {
        if (i == arreglo1.length) {
            return arreglo3;
        } else {
            arreglo3[i] = arreglo1[i] + arreglo2[i];
            return sumaArreglo(arreglo1, arreglo2, arreglo3, i + 1);
        }
    }
}