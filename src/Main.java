
public class Main {

    public static void main(String[] args) {

        // Prueba de la pila estática
        System.out.println("===== PILA ESTATICA =====");

        PilaSimple pilaEstatica = new PilaSimple(5);

        pilaEstatica.push(10);
        pilaEstatica.push(20);
        pilaEstatica.push(30);
        pilaEstatica.push(40);
        pilaEstatica.push(50);
        pilaEstatica.push(60); // Prueba de pila llena

        pilaEstatica.mostrar();

        System.out.println("Elemento de arriba: " + pilaEstatica.peek());
        System.out.println("Elemento eliminado: " + pilaEstatica.pop());

        pilaEstatica.mostrar();

        System.out.println("¿Está vacía? " + pilaEstatica.isEmpty());
        System.out.println("¿Está llena? " + pilaEstatica.isFull());


        // Prueba de la pila dinámica
        System.out.println("\n===== PILA DINAMICA =====");

        PilaDinamica pilaDinamica = new PilaDinamica();

        pilaDinamica.push(10);
        pilaDinamica.push(20);
        pilaDinamica.push(30);

        pilaDinamica.mostrar();

        System.out.println("Elemento de arriba: " + pilaDinamica.peek());
        System.out.println("Elemento eliminado: " + pilaDinamica.pop());

        pilaDinamica.mostrar();

        System.out.println("¿Está vacía? " + pilaDinamica.isEmpty());

        // Vaciar la pila dinámica
        pilaDinamica.pop();
        pilaDinamica.pop();

        System.out.println("¿Está vacía después de eliminar todo? "
                + pilaDinamica.isEmpty());
    }
}
