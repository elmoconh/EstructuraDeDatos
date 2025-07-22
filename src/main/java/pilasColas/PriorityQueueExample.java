package pilasColas;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue <Integer> queue = new PriorityQueue<>();
        queue.add(6);
        queue.add(9);
        queue.add(8);
        queue.add(1);
        queue.add(3);

        // Imprimir los elementos de la cola
        System.out.println("Elementos de la cola: ");
        queue.forEach(System.out::println);

    }
}
