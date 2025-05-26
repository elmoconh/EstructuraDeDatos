package listas.listaEnlazada;

// Clase Node: representa un nodo de una lista enlazada
public class Node {

    // Atributos privados del nodo
    private Object data; // valor almacenado en el nodo (puede ser cualquier tipo de objeto)
    private Node next;   // referencia al siguiente nodo en la lista

    // Constructor: crea un nodo con un valor inicial
    public Node(Object datos){
        // Inicializamos el nodo con el dato recibido
        this.data = datos;
    }

    // Método que devuelve el valor almacenado en el nodo
    public Object value(){
        return this.data;
    }

    // Método que devuelve la referencia al siguiente nodo
    public Node next(){
        return this.next;
    }

    // Método para establecer el nodo siguiente
    public void setNext(Node nodo){
        this.next = nodo;
    }

    // Método para mostrar el contenido del nodo
    public void showContent(){
        System.out.println("Value: " + this.data);
    }
}
