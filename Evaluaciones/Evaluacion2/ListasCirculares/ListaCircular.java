import java.util.Scanner;

import javax.sound.sampled.AudioFormat.Encoding;

public class ListaCircular {
    private Nodo primero;
    private Nodo ultimo;
    private Nodo inicio;

    
    public ListaCircular() {
        this.primero = null;
        this.ultimo = null;
        this.inicio = inicio;
    }

    public void insertar(Integer dato) {
        Nodo nuevo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;

            if (aux.getSiguiente() == null) {
                inicio.setSiguiente(nuevo);
                inicio.setAnterior(nuevo);
                nuevo.setSiguiente(inicio);
                nuevo.setAnterior(inicio);
            } else {
                while ((aux.getSiguiente() != inicio) && (aux.getDato() < dato)) {
                    aux = aux.getSiguiente();
                }
    
                if ((aux.getSiguiente() == inicio) && (aux.getDato() < dato)) {
                    aux.setSiguiente(nuevo);
                    nuevo.setAnterior(aux);
                    nuevo.setSiguiente(inicio);
                    inicio.setAnterior(nuevo);
                } else {
                    Nodo anterior = aux.getAnterior();
                    nuevo.setAnterior(anterior);
                    anterior.setSiguiente(nuevo);
                    nuevo.setSiguiente(aux);
                    aux.setAnterior(nuevo);
    
                    if ((aux == inicio) && (inicio.getDato() > dato)) {
                        inicio = nuevo;
                    }
                }
            }
        }
    }

    public boolean buscar(Integer dato) {
        Nodo aux = inicio;

        while ((aux.getSiguiente() != inicio) && (!(aux.getDato().equals(dato)))) {
            aux = aux.getSiguiente();
        }

        return aux.getDato().equals(dato);
    }

    public void actualizar(int dato) {
        Scanner t = new Scanner(System.in);
        
        if (buscar(dato)) {
            Nodo aux = inicio;

            while (aux.getDato() != dato) {
                aux = aux.getSiguiente();
            }
            System.out.print("\n\tDigite el nuevo dato: ");
            aux.setDato(t.nextInt());
        } else {
            System.out.println("\nEl dato no existe");
        }
    }

    public void eliminar(Integer dato) {
        Nodo aux = inicio;
        boolean encontrado = false; 
        Nodo ultimo = inicio.getAnterior();

        if (inicio.getDato() == dato) {
            aux = aux.getSiguiente();
            inicio = inicio.getSiguiente();
            aux.setAnterior(ultimo);
            ultimo.setSiguiente(inicio);
            encontrado = true;
        }

        while (aux.getSiguiente() != ultimo && aux.getSiguiente().getDato() != dato) {
            aux = aux.getSiguiente();
        }

        if (aux.getSiguiente().getDato() == dato) {
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
            aux.getSiguiente().getSiguiente().setAnterior(aux);
            encontrado = true;
            System.out.println("\n\tDato eliminado con éxito");
        }

        if (encontrado == false) {
            System.out.println("\n\tEl dato " + dato + " no existe en la lista");
        }
    }

    public void mostrarDatos() {
        if (inicio == null) {
            System.out.println("\nLa lista está vacía");
        } else {
            Nodo aux = inicio;
            System.out.print("<--> Inicio ");

            do {
                System.out.print(" <--> " + aux.getDato());
                aux = aux.getSiguiente();
            } while (aux != inicio);
            System.out.print(" <--> Null <--> ");
        }

        
    }
}
