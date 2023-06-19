public class ListaSimple {
    private Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }

    public void nuevoDato(String info) {
        if (this.inicio == null) {
            this.inicio = new Nodo(info);
        } else {
            Nodo temp = this.inicio;
            while (temp.getEnlace() != null) {
                temp = temp.getEnlace();
            }
            temp.setEnlace(new Nodo(info));
        }
    }

    public void buscar(String target) {
        Nodo temp = this.inicio;
        int pos = 0;
        boolean encontrado = false;
        while (temp != null) {
            if (temp.getDato() == target) {
                System.out.printf("Se encontró el valor %s en la posición %d\n", target, pos);
                encontrado = true;
                break;
            }
            temp = temp.getEnlace();
            pos++; 
        }
        if (encontrado == false) {
            System.out.println("El valor no existe en la lista");
        }
    }

    public void eliminar(String target) {
        if (this.inicio.getDato() == target) {
            this.inicio = inicio.getEnlace();
        }
        while (true) {
            int band = 0;
            Nodo temp = this.inicio;
            
            while (temp.getEnlace() != null && temp.getEnlace().getDato() != target) {
                temp = temp.getEnlace();
            }
            if (temp.getEnlace() != null) {
                temp.setEnlace(temp.getEnlace().getEnlace());
                band++;
            } 
            if (band == 0) {
                break;
            }
        }
    }       

    public void imprimeLista() {
        Nodo temp = this.inicio;
        while (temp != null) {
            System.out.println(temp.getDato());
            temp = temp.getEnlace();
        }
    }
}
