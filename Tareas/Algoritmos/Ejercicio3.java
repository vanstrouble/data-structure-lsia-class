import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int filas, columnas, capas, mayor = 0, c1 = 0, c2 = 0, c3 = 0;

        System.out.print("Número de filas: ");
        filas = entry.nextInt();
        System.out.print("Número de columnas: ");
        columnas = entry.nextInt();
        System.out.print("Número de capas: ");
        capas = entry.nextInt();

        int [][][] cubo = new int[filas][columnas][capas];

        System.out.println("\nIngrese los datos…");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < capas; k++) {
                    System.out.print("Cubo[" + i + "][" + j + "][" + k + "]: ");
                    cubo[i][j][k] = entry.nextInt();
                    if (cubo[i][j][k] > mayor) {
                        mayor = cubo[i][j][k];
                        c1 = i;
                        c2 = j;
                        c3 = k;
                    }
                }
            }
        }

        System.out.println("\nEl mayor valor es: " + mayor + "\nEn las coordenadas: [" + c1 + "][" + c2 + "][" + c3 + "]");
    }
}
