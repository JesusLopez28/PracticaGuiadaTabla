package practicaguiadatabla;

import javax.swing.JOptionPane;

public class Lista {

    protected Nodo lista;
    protected int cantNodos;

    public Lista() {
        this.lista = null;
        this.cantNodos = 0;
    }

    public Nodo getLista() {
        return lista;
    }

    public void setLista(Nodo lista) {
        this.lista = lista;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }

    public void agregarNodo(int v) {
        Nodo nuevo = new Nodo(v, null);
        if (lista == null) {
            lista = nuevo;
        } else {
            Nodo aux = lista;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        cantNodos++;
    }

    public int[] imprimirLista() {
        Nodo aux = lista;
        int[] arreglo = new int[cantNodos];
        int j = 0, i = 0;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
        } else {
            while (aux != null) {
                arreglo[j] = aux.getValor();
                aux = aux.siguiente;
                i++;
                j++;
            }
        }
        return arreglo;
    }
}
