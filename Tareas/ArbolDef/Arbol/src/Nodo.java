/**
 * Nodo
 */
public class Nodo {

    int valor;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;
    private int altura;
    private int fe;

    public Nodo(int v) {
        this.valor = v;
        this.hojaIzquierda = null;
        this.hojaDerecha = null;
        this.altura = 0;
        this.fe = 0;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }

    
}