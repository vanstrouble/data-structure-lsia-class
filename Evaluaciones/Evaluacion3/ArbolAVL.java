public class ArbolAVL {
    protected Nodo raiz;

    // Checar si el árbol está vacío
    public Boolean estaVacio() {
        return raiz == null;
    }

    // Regresamos el número de Nodos
    public Integer tamanio() {
        return tamanio(raiz);
    }

    // Regresamos el número de nodos en el subarbol
    private Integer tamanio(Nodo x) {
        if (x == null) return 0;
        return x.getTamanio();
    }

    // Retornamos la altura de árbol interno
    public Integer altura() {
        return altura(raiz);
    }

    // Regresamos la altura del subarbol
    private Integer altura(Nodo x) {
        if (x == null) return -1;
        return x.getAltura();
    }

    // Insertar un valor especifico en el arbol 
    public void insertar(Integer val) {
        raiz = insertar(raiz, val);
    }

    // Recorre el arbol para encontrar un valor. Devuelve un nodo o null si no lo encuentra
    public Nodo buscar(Integer val, Nodo x) {
        if (x == null) {
            return null;
        }
        if (x.getValor() == val) {
            return x;
        } else if (val < x.getValor()) {
            return buscar(val, x.getIzquierda());
        } else {
            return buscar(val, x.getDerecha());
        }
    }

    // Insertar el valor en el subarbol
    private Nodo insertar(Nodo x, Integer val) {
        if (x == null) return new Nodo(val, 0, 1);

        if (val < x.getValor()) {
            x.setIzquierda(insertar(x.getIzquierda(), val));
        } else if (val > x.getValor()) {
            x.setDerecha(insertar(x.getDerecha(), val));
        } else {
            x.setValor(val);
            return x;
        }
        x.setTamanio(1 + tamanio(x.getIzquierda()) + tamanio(x.getDerecha()));
        x.setAltura(1 + Math.max(altura(x.getIzquierda()), altura(x.getDerecha())));
        return balance(x);
    }

    // Restauración del AVL
    private Nodo balance(Nodo x) {
        if (factorEquilibrio(x) > 1) {
            if (factorEquilibrio(x.getDerecha()) < 0) {
                x.setDerecha(rotacionDerecha(x.getDerecha()));
            }
            x = rotacionIzquierda(x);
        } else if (factorEquilibrio(x) < -1) {
            if (factorEquilibrio(x.getIzquierda()) > 0) {
                x.setIzquierda(rotacionIzquierda(x.getIzquierda()));
            }
            x = rotacionDerecha(x);
        }
        return x;
    }

    // Regresamos el Factor de Equilibrio del subarbol
    private Integer factorEquilibrio(Nodo x) {
        return altura(x.getDerecha()) - altura(x.getIzquierda());
    }

    // Rotacion derecha
    private Nodo rotacionDerecha(Nodo x) {
        Nodo aux = x.getIzquierda();
        x.setIzquierda(aux.getDerecha());
        aux.setDerecha(x);
        aux.setTamanio(x.getTamanio());
        x.setTamanio(1 + tamanio(x.getIzquierda()) + tamanio(x.getDerecha()));
        x.setAltura(1 + Math.max(altura(x.getIzquierda()), altura(x.getDerecha())));
        aux.setAltura(1 + Math.max(altura(x.getIzquierda()), altura(x.getDerecha())));
        return aux;
    }

    // Rotacion izquierda
    private Nodo rotacionIzquierda(Nodo x) {
        Nodo aux = x.getDerecha();
        x.setDerecha(aux.getIzquierda());
        aux.setIzquierda(x);
        aux.setTamanio(x.getTamanio());
        x.setTamanio(1 + tamanio(x.getIzquierda()) + tamanio(x.getDerecha()));
        x.setAltura(1 + Math.max(altura(x.getIzquierda()), altura(x.getDerecha())));
        aux.setAltura(1 + Math.max(altura(aux.getIzquierda()), altura(aux.getDerecha())));
        return aux;
    }

    // Eliminar un valor especifico
    public void eliminar(Integer val) {
        raiz = eliminar(raiz, val);
    }

    // Eliminar un valor con el Nodo que se le está pasando
    private Nodo eliminar(Nodo x, Integer val) {
        if (val < x.getValor()) {
            x.setIzquierda(eliminar(x.getIzquierda(), val));
        } else if (val > x.getValor()) {
            x.setDerecha(eliminar(x.getDerecha(), val));
        } else {
            if (x.getIzquierda() == null) {
                return x.getDerecha();
            } else if (x.getDerecha() == null) {
                return x.getIzquierda();
            } else {
                Nodo aux = x;
                x = min(aux.getDerecha());
                x.setDerecha(eliminarMin(aux.getDerecha()));
                x.setIzquierda(aux.getIzquierda());
            }
        }
        x.setTamanio(1 + tamanio(x.getIzquierda()) + tamanio(x.getDerecha()));
        x.setAltura(1 + Math.max(altura(x.getIzquierda()), altura(x.getDerecha())));
        return balance(x);
    }

    // Eliminar el nodo mas pequeño
    private Nodo eliminarMin(Nodo x) {
        if (x.getIzquierda() == null) return x.getDerecha();
        x.setIzquierda(eliminarMin(x.getIzquierda()));
        x.setTamanio(1 + tamanio(x.getIzquierda()) + tamanio(x.getDerecha()));
        x.setAltura(1 + Math.max(altura(x.getIzquierda()), altura(x.getDerecha())));
        return balance(x);
    }

    // Regresar el nodo más pequeño
    private Nodo min(Nodo x) {
        if (x.getIzquierda() == null) return x;
        return min(x.getIzquierda());
    }

    // Recorrer el arbol inOrden: I - R - D
    public void inOrden(Nodo n) {
        if (n != null) {
            inOrden(n.getIzquierda());
            System.out.print(n.getValor() + ", ");
            inOrden(n.getDerecha());
        }
    }

    // Recorrer el arbol PreOrden: R - I - D
    public void preOrden(Nodo n) {
        if (n != null) {
            System.out.print(n.getValor() + ", ");
            preOrden(n.getIzquierda());
            preOrden(n.getDerecha());
        }
    }

    // Recorrer el arbol PostOrden: I - D - R
    public void postOrden(Nodo n) {
        if (n != null) {
            postOrden(n.getIzquierda());
            postOrden(n.getDerecha());
            System.out.print(n.getValor() + ", ");
        }
    }
}
