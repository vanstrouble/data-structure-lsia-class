import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opcion, dato;

        System.out.println("\n.:LISTAS CIRCULARES DOBLEMENTE ENLAZADAS:.");

        do {
            System.out.println("\n\t.:MENÚ:.");
            System.out.println("1. Ingresar nodos");
            System.out.println("2. Mostrar la lista de nodos");
            System.out.println("3. Modificar un nodo");
            System.out.println("4. Buscar nodo");
            System.out.println("5. Eliminar nodo");
            System.out.println("6. Salir");
            System.out.print("Digite la opción: ");
            opcion = t.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n\tDigite el nodo: ");
                    dato = t.nextInt();
                    lista.insertar(dato);
                    break;
                case 2:
                    System.out.println("\n\tMostrando la lista: \n");
                    lista.mostrarDatos();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("\n\tDigite el nodo a modificar: ");
                    dato = t.nextInt();
                    lista.actualizar(dato);
                    break;
                case 4: 
                    System.out.print("\n\tDigite el nodo a buscar: ");
                    dato = t.nextInt();
                    if (lista.buscar(dato) == true) {
                        System.out.println("\n\tEl nodo con valor " + dato + " SI está en la lista");
                    } else {
                        System.out.println("\n\tEl nodo NO se encuentra o no existe");
                    }
                    break;
                case 5:
                    System.out.print("\n\tDigite el nodo a eliminar: ");
                    dato = t.nextInt();
                    lista.eliminar(dato);
                    break;
                case 6:
                    break;
                default:
                    System.err.println("\nDigite una opción válida");
                    break;
            }
        } while (opcion != 6);
        
    }
}
