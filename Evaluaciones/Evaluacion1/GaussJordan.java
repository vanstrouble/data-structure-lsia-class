import java.util.Scanner;

public class GaussJordan {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);

        int i, j, s, k, h, n;
        double d;
        double m[][];
        double r[];
        double x[];

        System.out.print("Digite el número de incógnitas: ");
        n = t.nextInt();

        m = new double[n][n];
        r = new double[n];
        x = new double[n];

        for (i = 0; i <= n - 1; i++) {
            k = i + 1;
            System.out.print("\nDigite la solución " + k + ": ");
            r[i] = t.nextDouble();
            x[i] = 0;
            for (j = 0; j <= n - 1; j++) {
                h = j + 1;
                System.out.print("Digite el elemento " + "[" + k + "][" + h + "] de la matriz: ");
                m[i][j] = t.nextDouble();
            }
        }
        System.out.println();

        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (i == j) {
                    d = m[i][j];
                    for (s = 0; s < n; s++) {
                        m[i][s] = ((m[i][s]) / d);
                    }
                    r[i] = ((r[i]) / d);
                } else {
                    d = m[i][j];
                    for (s = 0; s < n; s++) {
                        m[j][s] = m[j][s] - (d * m[i][s]);
                    }
                    r[j] = r[j] - (d * r[i]);
                }
            }
        }
        for (i = n - 1; i >= 0; i--) {
            double y = r[i];
            for (j = n - 1; j >= i; j--) {
                y = y - x[j] * m[i][j];
            }
            x[i] = y;
        }
        for (i = 0; i < n; i++) {
            k = i + 1;
            System.out.println("El valor de la incógnita x" + k + " es: " + x[i]);
        }
        System.out.println();
        t.close();
    }
}
