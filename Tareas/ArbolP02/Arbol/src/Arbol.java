public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    // Método para insertar
    public void insertar(int v) {
        Nodo nuevo = new Nodo(v);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo aux = raiz;
            Nodo padre;
            while (true) {
                padre = aux;
                if (v < aux.getValor()) {
                    aux = aux.getHojaIzquierda();
                    if (aux == null) {
                        padre.setHojaIzquierda(nuevo);
                        return;
                    }
                } else {
                    aux = aux.getHojaDerecha();
                    if (aux == null) {
                        padre.setHojaDerecha(nuevo);
                        return;
                    }
                }
            }
        }
    }

    // Método para eliminar un Nodo del árbol
    public boolean eliminar(int d) {
        Nodo aux = raiz;
        Nodo padre = raiz;
        boolean esHojaIzq = true;
        while (aux.getValor() != d) {
            padre = aux;
            if (d < aux.getValor()) {
                esHojaIzq = true;
                aux = aux.getHojaIzquierda();
            } else {
                esHojaIzq = false;
                aux = aux.getHojaDerecha();
            }
            if (aux == null) {
                return false;
            } 
        } // Fin del while
        if (aux.getHojaIzquierda() == null && aux.getHojaDerecha() == null) {
            if (aux == raiz) {
                raiz = null;
            } else if (esHojaIzq) {
                padre.setHojaIzquierda(null);
            } else {
                padre.setHojaDerecha(null);
            }
        } else if (aux.getHojaDerecha() == null) {
            if (aux == raiz) {
                raiz = aux.getHojaIzquierda();
            } else if (esHojaIzq) {
                padre.setHojaIzquierda(aux.getHojaIzquierda());
            } else {
                padre.setHojaDerecha(aux.getHojaIzquierda());
            }
        } else if (aux.getHojaIzquierda() == null) {
            if (aux == raiz) {
                raiz = aux.getHojaDerecha();
            } else if (esHojaIzq) {
                padre.setHojaIzquierda(aux.getHojaDerecha());
            } else {
                padre.setHojaDerecha(aux.getHojaIzquierda());
            }
        } else {
            Nodo reemplazo = obtenerNodoReemplazo(aux);
            if (aux == raiz) {
                raiz = reemplazo;
            } else if (esHojaIzq) {
                padre.setHojaIzquierda(reemplazo);
            } else {
                padre.setHojaDerecha(reemplazo);
            }
            reemplazo.setHojaIzquierda(aux.getHojaIzquierda());
        }
        return true;
    }

    // Método encargado de devolvernos el nodo reemplazo
    public Nodo obtenerNodoReemplazo(Nodo nodoReemp) {
        Nodo reemplazarPadre = nodoReemp;
        Nodo reemplazo = nodoReemp;
        Nodo aux = nodoReemp.getHojaDerecha();
        while (aux != null) {
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.getHojaIzquierda();
        }
        if (reemplazo != nodoReemp.getHojaDerecha()) {
            reemplazarPadre.setHojaIzquierda(reemplazo.getHojaDerecha());
            reemplazo.setHojaDerecha(nodoReemp.getHojaDerecha());
        }
        System.out.println("\nEl nodo reemplazo es: " + reemplazo.getValor());
        return reemplazo;
    }

    // Método para saber si el arbol está vacío
    public boolean estaVacio() {
        return raiz == null;
    }

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

    // Método para buscar un nodo en el árbol
    public Nodo buscarNodo(int d) {
        Nodo aux = raiz;
        while (aux.getValor() != d) {
            if (d < aux.getValor()) {
                aux = aux.getHojaIzquierda();
            } else {
                aux = aux.getHojaDerecha();
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }
}
