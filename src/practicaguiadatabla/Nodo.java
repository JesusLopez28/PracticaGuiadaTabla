package practicaguiadatabla;

public class Nodo {

    protected Nodo siguiente;
    protected int valor;

    public Nodo(int valor) {
        this.siguiente = null;
        this.valor = valor;
    }

    public Nodo(int valor, Nodo N) {
        this.siguiente = N;
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
