import java.util.Scanner;

/* Ejercicio 5 
5) Realice un programa el cual capture y ordene la estatura de los alumnos de la 
materia de estructura de datos.
*/

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numeroAlumnos;
        float[] estaturas;
        float aux;

        System.out.println("\t.:ESTATURAS ESTRUCTURA DE DATOS:.\n");
        System.out.print("Digite el número de alumnos a ingresar: ");
        numeroAlumnos = leer.nextInt();

        estaturas = new float[numeroAlumnos];

        System.out.println("\nIngrese estaturas de alumnos…");
        for (int i = 0; i < estaturas.length; i++) {
            System.out.print("Digite la estatura del alumno (" + (i + 1) + "): ");
            estaturas[i] = leer.nextFloat();
        }
        leer.close();

        // Método burbuja
        for (int i = 0; i < estaturas.length - 1; i++) {
            for (int j = 0; j < estaturas.length - 1; j++) {
                if (estaturas[j] > estaturas[j + 1]) {
                    aux = estaturas[j];
                    estaturas[j] = estaturas[j + 1];
                    estaturas[j + 1] = aux;
                }
            }
        }

        System.out.println("\nEstaturas ordenadas");
        for (float estatura : estaturas) {
            System.out.println(estatura);
        }
        System.out.println();
    }
}
