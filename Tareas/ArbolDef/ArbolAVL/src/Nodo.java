  public class Nodo {
    private Integer valor;
    private Integer fe;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;

    public Nodo(int v) {
        this.valor = v;
        this.fe = 0;
        this.hojaIzquierda = null;
        this.hojaDerecha = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
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
}
