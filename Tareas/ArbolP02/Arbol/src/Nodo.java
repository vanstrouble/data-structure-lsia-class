/**
 * Nodo
 */
public class Nodo {

    int valor;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;

    public Nodo(int v) {
        this.valor = v;
        this.hojaIzquierda = null;
        this.hojaDerecha = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }

    
}