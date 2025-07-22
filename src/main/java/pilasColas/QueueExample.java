package pilasColas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        // Agregar elementos a la cola
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        // Imprimir el elemento al frente de la cola
        System.out.println("Elemento de la cola: " );
        queue.forEach(System.out::println);
        // Eliminar el primer elemento de la cola
        int head = queue.poll();
        // int head = queue.remove(); // También se puede usar remove() para eliminar el primer elemento la diferencia es que poll() devuelve null si la cola está vacía, mientras que remove() lanza una excepción.
        System.out.println("Elemento eliminado de la cola: " + head);
        queue.forEach(System.out::println);

    }
}
