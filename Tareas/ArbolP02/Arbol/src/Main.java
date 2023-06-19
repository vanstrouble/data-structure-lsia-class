import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        int opc = 0, elemento;
        Arbol arbol = new Arbol();

        System.out.println("\t.:ÁRBOLES BINARIOS:.");

        do {
            try {
                System.out.println("\n.:MENU:.");
                System.out.println("1. Ingresar nodo");
                System.out.println("2. Recorrer arbol InOrder");
                System.out.println("3. Recorrer arbol PreOrden");
                System.out.println("4. Recorrer arbol PostOrden");
                System.out.println("5. Buscar nodo");
                System.out.println("6. Eliminar nodo");
                System.out.println("7. Salir");
                System.out.print("Opción: ");
                opc = t.nextInt();

                switch (opc) {
                    case 1:
                        if (!arbol.estaVacio()) {
                            System.out.print("\nDigite el elemento: ");
                            elemento = t.nextInt();
                            if (arbol.buscarNodo(elemento) == null) {
                                arbol.insertar(elemento);
                            } else {
                                System.out.println("\nNodo ya existente");
                            }
                        } else {
                            System.out.print("\nDigite el elemento: ");
                            elemento = t.nextInt();
                            arbol.insertar(elemento);
                        }
                        break;
                    case 2:
                        if (!arbol.estaVacio()) {
                            System.out.println("\nÁrbol InOrden: ");
                            arbol.inOrden(arbol.raiz);
                            System.out.println();
                        } else {
                            System.out.println("\nEl arbol está vacío");
                        }
                        break;
                    case 3:
                        if (!arbol.estaVacio()) {
                            System.out.println("\nÁrbol PreOrden: ");
                            arbol.preOrden(arbol.raiz);
                            System.out.println();
                        } else {
                            System.out.println("\nEl arbol está vacío");
                        }
                        break;
                    case 4:
                        if (!arbol.estaVacio()) {
                            System.out.println("\nÁrbol PostOrden: ");
                            arbol.postOrden(arbol.raiz);
                            System.out.println();
                        } else {
                            System.out.println("\nEl arbol está vacío");
                        }
                        break;
                    case 5:
                        if (!arbol.estaVacio()) {
                            System.out.print("\nElemento a buscar: ");
                            elemento = t.nextInt();

                            if (arbol.buscarNodo(elemento) == null) {
                                System.out.println("\nEl elemento " + elemento + " no se encuentra en el árbol");
                            } else {
                                System.out.println("\nNodo encontrado");
                            }

                        } else {
                            System.out.println("\nEl arbol está vacío");
                        }
                        break;
                    case 6:
                        if (!arbol.estaVacio()) {
                            System.out.print("\nElemento a eliminar: ");
                            elemento = t.nextInt();

                            if (arbol.eliminar(elemento) == false) {
                                System.out.println("\nEl elemento " + elemento + " no se encuentra en el árbol");
                            } else {
                                System.out.println("\nEl nodo " + elemento + " ha sido eliminado");
                            }

                        } else {
                            System.out.println("\nEl arbol está vacío");
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.err.println("\nDigite una opción válida");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. " + e.getMessage());
            }
        } while (opc != 7);
    }
}
