
public class PilaSimple {

    private int[] datos;
    private int tope;

    public PilaSimple(int capacidad) {
        datos = new int[capacidad];
        tope = -1;
    }

    // Agrega un elemento a la pila
    public void push(int x) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar " + x);
        } else {
            tope++;
            datos[tope] = x;
            System.out.println("Se agregó: " + x);
        }
    }

    // Elimina y devuelve el elemento de arriba
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede eliminar.");
            return null;
        }

        int elemento = datos[tope];
        tope--;
        return elemento;
    }

    // Muestra los elementos desde arriba hacia abajo
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Elementos de la pila (de arriba hacia abajo):");
        for (int i = tope; i >= 0; i--) {
            System.out.println(datos[i]);
        }
    }

    // Indica si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // Indica si la pila está llena
    public boolean isFull() {
        return tope == datos.length - 1;
    }

    // Consulta el elemento de arriba sin eliminarlo
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No hay elemento arriba.");
            return null;
        }

        return datos[tope];
    }
}
