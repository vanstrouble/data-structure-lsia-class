/**
 * Nodo
 */
public class Nodo {
    private String dato; // puede ser cualquier cantidad de información
    private Nodo enlace;

    public Nodo(String dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}