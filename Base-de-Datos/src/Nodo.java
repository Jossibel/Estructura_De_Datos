public class Nodo {
    private Object valor;
    private Nodo izquierda;
    private Nodo derecha;

    // Constructor
    public Nodo(Object valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    // Getters y setters
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}