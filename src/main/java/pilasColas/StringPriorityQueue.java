package pilasColas;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        // añadimos items a nuestra cola de prioridad
        queue.add("Banana");
        queue.add("Apple");
        queue.add("Orange");

        //Mostramos sin eliminar, el elemento con mayor prioridad
        System.out.println("Elemento con mayor prioridad: " + queue.peek());

        //removemos el elemento top de la cola de prioridad (o head)
        String removedElement = queue.poll();
        System.out.println("Elemento eliminado: " + removedElement);

        // Mostramos nuevamente el elemento con mayor prioridad
        System.out.println("Nuevo elemento con mayor prioridad: " + queue.peek());

        //Eliminamos un elemento en especifico
        queue.remove("Apple");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //checar que un elemento existe
        boolean exists = queue.contains("Banana");
        System.out.println("exists = " + exists);

        //Obteniendo los elementos de la cola en un array
        Object [] array = queue.toArray();
        System.out.println("Elementos en el array:");
        for (Object element : array) {
            System.out.println(element);
        }

    }
}
