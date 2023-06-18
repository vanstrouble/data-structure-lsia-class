public class Nodo {
    private Integer valor;
    private Integer altura;
    private Integer tamanio;
    private Nodo izquierda;
    private Nodo derecha;
    
    
    public Nodo(Integer valor, Integer altura, Integer tamanio) {
        this.valor = valor;
        this.altura = altura;
        this.tamanio = tamanio;
        this.izquierda = null;
        this.derecha = null;
    }


    public Integer getValor() {
        return valor;
    }


    public void setValor(Integer valor) {
        this.valor = valor;
    }


    public Integer getAltura() {
        return altura;
    }


    public void setAltura(Integer altura) {
        this.altura = altura;
    }


    public Integer getTamanio() {
        return tamanio;
    }


    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }


    public Nodo getIzquierda() {
        return izquierda;
    }


    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }


    public Nodo getDerecha() {
        return derecha;
    }


    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    } 

    
}
