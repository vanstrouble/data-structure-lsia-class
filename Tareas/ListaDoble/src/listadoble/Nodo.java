/*
 */

package listadoble;

/**
 * 
 * @author pedrovazquezg
 */
public class Nodo {
    private Nodo anterior;
    private String dato;
    private Nodo siguiente;

    public Nodo(String dato) {
        this.anterior = null;
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
