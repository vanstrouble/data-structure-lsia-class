import java.util.Scanner;

public class ListaCircular {
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaCircular() {
        this.primero = null;
        this.ultimo = null;
    }

    public void ingresar(Integer x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setDato(x);

        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(primero);
            primero.setAnterior(ultimo);
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
            primero.setAnterior(ultimo);
        }
    }

    public void actualizar(Integer x) {
        Scanner t = new Scanner(System.in);
        Nodo actual = new Nodo(x);
        actual.setDato(x);
        actual = primero;

        do {
            if (actual.getDato() == x) {
                System.out.print("\nDigite el nuevo dato: ");
                actual.setDato(t.nextInt());
            }
            actual = actual.getSiguiente();
        } while (actual != primero);
    }

    public void buscar(Integer x) {
        Nodo actual = new Nodo(x);
        int valor = 0;
        boolean encontrado = false;
        actual = ultimo;

        do {
            if (actual.getDato() == x) {
                encontrado = true;
                valor = actual.getDato();
            } else {
                encontrado = false;
                continue;
            }
            actual = actual.getAnterior();
        } while (actual != ultimo && !encontrado);

        if (encontrado == true) {
            System.out.println("\nEl nodo " + valor + " fue encontrado en la lista");
        } else {
            System.out.println("\nNodo no encontrado");
        }
    }

    public void mostrar() {
        Nodo actual = primero;
        
        do {            
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        } while (actual != primero);
    }

    public void eliminar(Integer x) {
        Nodo actual = new Nodo(x);
        Nodo anterior = new Nodo(x);
        actual = primero;
        anterior = ultimo;

        do {
            if (actual.getDato() == x) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                    ultimo.setSiguiente(primero);
                    primero.setAnterior(ultimo);
                } else if (actual == ultimo) {
                    ultimo = anterior;
                    primero.setAnterior(ultimo);
                    ultimo.setSiguiente(primero);
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(anterior);
                }
            }
            anterior = actual;
            actual = actual.getSiguiente();
        } while (actual != primero);
    }
}
