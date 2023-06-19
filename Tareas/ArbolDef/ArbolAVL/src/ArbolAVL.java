public class ArbolAVL {
    private Nodo raiz;

    public ArbolAVL() {
        raiz = null;
    }

    // Buscar un nodo
    public Nodo buscar(int v, Nodo r) {
        if (raiz == null) {
            return null;
        } else if (r.getValor() == v){
            return r;
        } else if (r.getValor() < v) {
            return buscar(v, r.getHojaDerecha());
        } else {
            return buscar(v, r.getHojaIzquierda());
        }
    }

    // Obtener el factor de quilibrio
    public int obtenerFE(Nodo x) {
        if (x == null) {
            return -1;
        } else {
            return x.getFe();
        }
    }

    // Rotación Simple Izquierda
    public Nodo rotacionIzquierda(Nodo x) {
        Nodo aux = x.getHojaIzquierda();
        x.setHojaIzquierda(aux.getHojaDerecha());
        aux.setHojaDerecha(x);
        x.setFe(Math.max(obtenerFE(x.getHojaIzquierda()), obtenerFE(x.getHojaDerecha())) + 1);
        aux.setFe(Math.max(obtenerFE(aux.getHojaIzquierda()), obtenerFE(aux.getHojaDerecha())) + 1);
        return aux;
    }

    // Rotación Simple Derecha
    public Nodo rotacionDerecha(Nodo x) {
        Nodo aux = x.getHojaDerecha();
        x.setHojaDerecha(aux.getHojaIzquierda());
        aux.setHojaIzquierda(x);
        x.setFe(Math.max(obtenerFE(x.getHojaIzquierda()), obtenerFE(x.getHojaDerecha())) + 1);
        aux.setFe(Math.max(obtenerFE(aux.getHojaIzquierda()), obtenerFE(aux.getHojaDerecha())) + 1);
        return aux;
    }

    // Rotación Doble Derecha
    public Nodo rotacionDobleIzquierda(Nodo x) {
        Nodo temp;
        x.setHojaIzquierda(rotacionDerecha(x.getHojaIzquierda()));
        temp = rotacionIzquierda(x);
        return temp;
    }

    // Rotación Doble Izquierda
    public Nodo rotacionDobleDerecha(Nodo x) {
        Nodo temp;
        x.setHojaDerecha(rotacionIzquierda(x.getHojaDerecha()));
        temp = rotacionDerecha(x);
        return temp;
    }

    // Método para insertar AVL
    public Nodo insertarAVL(Nodo nuevo, Nodo subArb) {
        Nodo nuevoPadre = subArb;
        if (nuevo.getValor() < subArb.getValor()) {
            if (subArb.getHojaIzquierda() == null) {
                subArb.setHojaIzquierda(nuevo);
            } else {
                subArb.setHojaIzquierda(insertarAVL(nuevo, subArb.getHojaDerecha()));
                if (obtenerFE((subArb.getHojaIzquierda())) - obtenerFE(subArb.getHojaDerecha()) == 2) {
                    if (nuevo.getValor() < subArb.getHojaIzquierda().getValor()) {
                        nuevoPadre = rotacionIzquierda(subArb);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subArb);
                    }
                }
            }
        } else if (nuevo.getValor() > subArb.getValor()) {
            if (subArb.getHojaDerecha() == null) {
                subArb.setHojaDerecha(nuevo);
            } else {
                subArb.setHojaDerecha(insertarAVL(nuevo, subArb.getHojaDerecha()));
                if ((obtenerFE(subArb.getHojaDerecha())) - obtenerFE(subArb.getHojaIzquierda()) == 2) {
                    if (nuevo.getValor() > subArb.getHojaDerecha().getValor()) {
                        nuevoPadre = rotacionDerecha(subArb);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subArb);
                    }
                }
            }
        } else {
            System.out.println("\nNodo duplicado");
        }
        // Actualizando la altura o FE
        if ((subArb.getHojaIzquierda() == null) && (subArb.getHojaDerecha() != null)) {
            subArb.setFe(subArb.getHojaDerecha().getFe() + 1);
        } else if ((subArb.getHojaDerecha() == null) && (subArb.getHojaIzquierda() != null)) {
            subArb.setFe(subArb.getHojaIzquierda().getFe() + 1);
        } else {
            subArb.setFe(Math.max(obtenerFE(subArb.getHojaIzquierda()), obtenerFE(subArb.getHojaDerecha())) + 1);
        }
        return nuevoPadre;
    }

    // Método para insertar
    public void insertar(int v) {
        Nodo nuevo = new Nodo(v);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }

    // Recorridos
    // Método para recorrer el arbol inOrden
    public void inOrden(Nodo r) {
        if (r != null) {
            inOrden(r.getHojaIzquierda());
            System.out.print(r.getValor() + ", ");
            inOrden(r.getHojaDerecha());
        }
    }

    // Método para recorrer el arbol PreOrden
    public void preOrden(Nodo r) {
        if (r != null) {
            System.out.print(r.getValor() + ", ");
            preOrden(r.getHojaIzquierda());
            preOrden(r.getHojaDerecha());
        }
    }

    // Método para recorrer el arbol PostOrden
    public void postOrden(Nodo r) {
        if (r != null) {
            postOrden(r.getHojaIzquierda());
            postOrden(r.getHojaDerecha());
            System.out.print(r.getValor() + ", ");
        }
    }
}
