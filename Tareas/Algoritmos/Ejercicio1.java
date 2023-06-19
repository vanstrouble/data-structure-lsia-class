import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int tamanio, sumaFilas;
        float promedio = 0;

        System.out.print("Digite el tamaño de la matriz: ");
        tamanio = entry.nextInt();

        int[][] matriz = new int[tamanio][tamanio];

        System.out.println("\nIngrese la matriz…");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entry.nextInt();
            }
        }

        // Promedio de las filas
        for (int i = 0; i < tamanio; i++) {
            sumaFilas = 0;
            for (int j = 0; j < tamanio; j++) {
                sumaFilas += matriz[i][j];
                promedio = (float) sumaFilas / tamanio;
            }
            System.out.print("\nEl promedio de la fila [" + i + "] es: " + promedio);
        }
        System.out.println(" ");
        entry.close();
    }
}