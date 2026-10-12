
public class PilaDinamica {

    // Cada nodo guarda un dato y la referencia al siguiente nodo
    private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cima;

    public PilaDinamica() {
        cima = null;
    }

    // Agrega un elemento en la cima
    public void push(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.siguiente = cima;
        cima = nuevo;

        System.out.println("Se agregó: " + x);
    }

    // Elimina y devuelve el elemento de la cima
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede eliminar.");
            return null;
        }

        int elemento = cima.dato;
        cima = cima.siguiente;
        return elemento;
    }

    // Muestra los elementos desde la cima hacia abajo
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Elementos de la pila (de arriba hacia abajo):");

        Nodo actual = cima;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Indica si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }

    // Consulta el elemento de arriba sin eliminarlo
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No hay elemento arriba.");
            return null;
        }

        return cima.dato;
    }
}
