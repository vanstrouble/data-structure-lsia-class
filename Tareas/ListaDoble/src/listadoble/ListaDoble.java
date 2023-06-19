/*
 */

package listadoble;

/**
 * 
 * @author pedrovazquezg
 */
public class ListaDoble {
    private Nodo inicio;

    public ListaDoble() {
        this.inicio = inicio;
    }
    
    public void insertar(String info) {
        if (this.inicio == null) {
            this.inicio = new Nodo(info);
        } else {
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {                
                temp = temp.getSiguiente();
            }
            Nodo nuevo = new Nodo(info);
            temp.setSiguiente(nuevo);
            nuevo.setAnterior(temp);
        }
    }
    
    public void mostrarDatos() {
        Nodo temp = inicio;
        while (temp != null) {            
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public void buscar(String target) {
        Nodo temp = this.inicio;
        int pos = 0;
        while (temp != null) {
            if (temp.getDato().compareTo(target) == 0) {
                System.out.printf("El dato fue encontrado en la posición %d\n", pos);
            }
            pos++;
            temp = temp.getSiguiente();
        }
    }

    public void fifo() { // Eliminar de inicio
        Nodo temp = this.inicio;
        if (temp != null) {
            this.inicio = inicio.getSiguiente();
            temp.setAnterior(null);
        } else {
            System.out.println("La lista está vacía");
        }
    }

    public void filo() { // Eliminar del final
        Nodo temp = this.inicio;
        if (temp == null) {
            System.out.println("La lista está vacía");
        } else {
            while (temp.getSiguiente().getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
        }
    }
}
