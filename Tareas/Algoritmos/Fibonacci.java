/**
 * A) Escriba una definición recursiva de una función que tiene un parámetro n de tipo entero 
 * y que devuelve el n-ésimo número de Fibonacci. Los números de Fibonacci se definen de la siguiente 
 * manera:
 * F0 = 1
 * F1 = 1
 * Fi+2 = Fi + Fi+1
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        int numero;

        System.out.println("\t.:SERIE FIBONACCI RECURSIVIDAD:.\n");

        System.out.print("Digite el número de elementos: ");
        numero = t.nextInt();
        t.close();
        
        impresion(numero);
    }

    private static int fibonacci(int n) {
        if (n == 0 ||n == 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    private static void impresion (int n) {
        int i = n;
        if (i == 0) {
            return;
        } else {
            System.out.printf("%d , ", fibonacci(i));
            impresion(i - 1);
        }
    }
}
