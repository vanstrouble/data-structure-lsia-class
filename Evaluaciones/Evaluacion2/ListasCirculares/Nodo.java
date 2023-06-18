/*
 */

/**
 * 
 * @author pedrovazquezg
 */
public class Nodo {
    private Nodo anterior;
    private Integer dato;
    private Nodo siguiente;

    public Nodo(Integer dato) {
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

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
