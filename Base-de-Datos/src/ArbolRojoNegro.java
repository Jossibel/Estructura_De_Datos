import java.awt.*;

public class ArbolRojoNegro extends ArbolBinario {
    // Atributo específico de ArbolRojoNegro
    public COLOR color;

    // Constructor de la clase ArbolRojoNegro
    public ArbolRojoNegro(int orden, int grado, int altura, Posicion posicionActual, Parte_Arbol parteActual, COLOR color) {
        super(orden, grado, altura, posicionActual, parteActual);
        this.color = color;
    }

    // Método específico de ArbolRojoNegro para balancear un nodo
    public void balancearNodo(Nodo nodo) {
        // Lógica para balancear el nodo en un árbol Rojo-Negro
    }

    // Getter y Setter para el atributo color
    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }
}