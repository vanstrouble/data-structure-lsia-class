/*
 */

package listadoble;

/**
 * 
 * @author pedrovazquezg
 */
public class Main {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        
        lista.insertar("Pedro");
        lista.insertar("Antonio");
        lista.insertar("Aideé");
        lista.insertar("Berenice");
        
        System.out.println("\nMostrando datos…");
        lista.mostrarDatos();
        
        System.out.println("\nBuscando a Aideé");
        lista.buscar("Aideé");

        System.out.println("\nMétodo FILO - Pilas");
        lista.filo();
        lista.mostrarDatos();

        System.out.println("\nMétodo FIFO - Colas");
        lista.fifo();
        lista.mostrarDatos();
    }
}
