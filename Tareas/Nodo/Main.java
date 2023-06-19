public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        
        lista.nuevoDato("11");
        lista.nuevoDato("24");
        lista.nuevoDato("45");
        lista.nuevoDato("16");
        lista.nuevoDato("15");
        lista.nuevoDato("22");
        
        System.out.println("\nLista original");
        lista.imprimeLista();

        System.out.println("\nSe busca el valor 16 de la lista");
        lista.buscar("16");

        System.out.println("\nSe elimina el valor 16");
        lista.eliminar("16");
        System.out.println("\nLista después de eliminar");
        lista.imprimeLista();

        System.out.println("\nMetodos fifo");
        lista.fifo();
        lista.imprimeLista();
        System.out.println("\nMetodo filo");
        lista.filo();
        lista.imprimeLista();
    }
}
