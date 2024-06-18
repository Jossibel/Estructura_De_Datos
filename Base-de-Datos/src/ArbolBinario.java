public class ArbolBinario extends EstructuraDeDatos implements Tipo_Recorrido {
    private Nodo raiz;
    private int orden;
    private int grado;
    private int altura;
    private Posicion posicionActual;
    private Parte_Arbol parteActual;

    // Constructor
    public ArbolBinario(int orden, int grado, int altura, Posicion posicionActual, Parte_Arbol parteActual) {
        this.orden = orden;
        this.grado = grado;
        this.altura = altura;
        this.posicionActual = posicionActual;
        this.parteActual = parteActual;
        this.raiz = null; // Inicialmente el árbol está vacío
    }

    // Implementación de los métodos abstractos de EstructuraDeDatos
    @Override
    public void agregar(Object valor) {
        // Implementación específica para agregar en árbol binario
        Nodo nuevoNodo = new Nodo(valor);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            // Lógica para agregar según las reglas del árbol binario
            agregarNodo(raiz, nuevoNodo);
        }
    }

    private void agregarNodo(Nodo raizActual, Nodo nuevoNodo) {
        // Implementación específica para agregar nodos según las reglas del árbol binario
        // Aquí deberías implementar la lógica para determinar dónde insertar el nuevo nodo
    }

    @Override
    public void insertar(Object valor) {
        // Implementación específica para insertar en árbol binario
        // Similar a agregar, pero con lógica de inserción específica
    }

    @Override
    public void eliminar(Object valor) {
        // Implementación específica para eliminar en árbol binario
        // Lógica para eliminar nodos según las reglas del árbol binario
    }

    // Implementación de los métodos de Tipo_Reorrido
    @Override
    public void ORDEN() {
        // Implementación del recorrido en orden (in-order traversal)
        orden(this.raiz);
    }

    private void orden(Nodo nodo) {
        if (nodo != null) {
            orden(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " ");
            orden(nodo.getDerecha());
        }
    }

    @Override
    public void POSORDEN() {
        // Implementación del recorrido en postorden (post-order traversal)
        posOrden(this.raiz);
    }

    private void posOrden(Nodo nodo) {
        if (nodo != null) {
            posOrden(nodo.getIzquierda());
            posOrden(nodo.getDerecha());
            System.out.print(nodo.getValor() + " ");
        }
    }

    @Override
    public void PREORDEN() {
        // Implementación del recorrido en preorden (pre-order traversal)
        preOrden(this.raiz);
    }

    private void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " ");
            preOrden(nodo.getIzquierda());
            preOrden(nodo.getDerecha());
        }
    }

    // Getters y setters para los atributos
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Parte_Arbol getParteActual() {
        return parteActual;
    }

    public void setParteActual(Parte_Arbol parteActual) {
        this.parteActual = parteActual;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
}
