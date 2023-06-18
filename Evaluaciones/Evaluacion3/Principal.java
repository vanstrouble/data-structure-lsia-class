public class Principal {
    public static void main(String[] args) {
        
        // Árbol con rotación doble a la izquierda
        ArbolAVL a1 = new ArbolAVL();
        a1.insertar(5);
        a1.insertar(3);
        a1.insertar(10);
        a1.insertar(7);
        a1.insertar(12);
        a1.insertar(6);

        System.out.println("\nARBOL 1: Recorrido en PreOrden tras una rotación doble a la izquierda al insertar el 6");
        a1.preOrden(a1.raiz);
        System.out.println();

        // Árbol con rotación doble a la derecha
        ArbolAVL a2 = new ArbolAVL();
        a2.insertar(9);
        a2.insertar(5);
        a2.insertar(10);
        a2.insertar(1);
        a2.insertar(7);
        a2.insertar(6);

        System.out.println("\nARBOL 2: Recorrido en PreOrden tras una rotación doble a la derecha al insertar el 6");
        a2.preOrden(a2.raiz);
        System.out.println();

        System.out.println("\nARBOL 1: Recorrido en PreOrden tras eliminar el 6");
        a1.eliminar(6);
        a1.preOrden(a1.raiz);
        System.out.println();

        System.out.println("\nARBOL 2: Recorrido en PreOrden tras eliminar el 6");
        a2.eliminar(6);
        a2.preOrden(a2.raiz);
        System.out.println();

        // Preguntar si está vacio y eliminar
        if (!a1.estaVacio()) {
            a1.eliminar(7);
            a1.eliminar(12);
            a1.eliminar(3);
            a1.eliminar(10);
            a1.eliminar(5);
        }

        // Preguntar su está vacio e imprimir
        if (!a1.estaVacio()) {
            a1.preOrden(a1.raiz);
        } else {
            System.out.println("\nÁrbol vacio");
        }

        System.out.println("\nARBOL 2: Buscando el 5");
        if (a2.buscar(5, a2.raiz) != null) {
            System.out.println("Valor encontrado");
        } else {
            System.out.println("No se encuentra el valor");
        }
    }
}
