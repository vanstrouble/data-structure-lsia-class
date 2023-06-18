import java.util.Scanner;

public class MultMatrices {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int matriz1[][];
        int matriz2[][];
        int mult[][];

        System.out.println("\tSUMA DE MATRICES 3x3");

        System.out.print("\nDigite el tamaño de las matrices: ");
        int tamaño = entry.nextInt();

        matriz1 = new int[tamaño][tamaño];
        matriz2 = new int[tamaño][tamaño];
        mult = new int[tamaño][tamaño];

        System.out.println("\nRellene la primer matriz");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Matriz 1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = entry.nextInt();
            }
        }
        System.out.println("\nRellene la segunda matriz");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Matriz 2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = entry.nextInt();
            }
        }
        
        entry.close();

        // Multiplicación de matrices
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                mult[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        System.out.println("\nLa multiplicación de las matrices es:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < mult.length; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
