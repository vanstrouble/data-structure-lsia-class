import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        ListaCircular lista = new ListaCircular();
        int opc, dato;


        System.out.println("\n.:LISTAS CIRCULARES DOBLEMENTE ENLAZADAS:.");

        do {            
            System.out.println("\n\t.:MENU:.");
            System.out.println("1. Ingresar nodo");
            System.out.println("2. Mostrar la lista");
            System.out.println("3. Modificar");
            System.out.println("4. Buscar");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opc = t.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nIngrese un dato: ");
                    dato = t.nextInt();
                    lista.ingresar(dato);
                    break;
                case 2:
                    System.out.println("\nMostrar lista");
                    lista.mostrar();
                    break;
                case 3:
                    System.out.print("\nDigite el dato a modificar: ");
                    dato = t.nextInt();
                    lista.actualizar(dato);
                    break;
                case 4:
                    System.out.print("\nDigite el dato a buscar: ");
                    dato = t.nextInt();
                    lista.buscar(dato);
                    break;
                case 5:
                    System.out.print("\nDigite el dato a eliminar: ");
                    dato = t.nextInt();
                    lista.eliminar(dato);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nPresione una opción válida");
                    break;
            }
        } while (opc != 6);
    }
}
