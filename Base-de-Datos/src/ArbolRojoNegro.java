public class ArbolRojoNegro extends ArbolBinario {
    // Atributo específico de ArbolRojoNegro
    private Color color;

    // Constructor de la clase ArbolRojoNegro
    public ArbolRojoNegro(int orden, int grado, int altura, Posicion posicionActual, Parte_Arbol parteActual, Color color) {
        super(orden, grado, altura, posicionActual, parteActual);
        this.color = color;
    }

    // Método específico de ArbolRojoNegro para balancear un nodo
    public void balancearNodo(Nodo nodo) {
        // Lógica para balancear el nodo en un árbol Rojo-Negro
    }

    // Getter y Setter para el atributo color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}