package listas.listaEnlazada;

public class SimpleLinkedList {
    private Node first; //referencia al primer nodo de la lista

    public SimpleLinkedList() {
        this.first = null;
    }

    public void push(Object data) {
        //este nuevo nodo será el primero de la lista
        Node newNode = new Node(data);
        //Ahora el nuevo nodo apunta al primer nodo de la lista
        newNode.setNext(this.first);
        this.first = newNode;
    }

    public Node pop() {
        //Si la lista está vacía
        if (this.first == null) {
            return null;
        }
        //Guardamos el primer nodo de la lista
        Node temp = this.first;
        //Ahora el primer nodo de la lista será el siguiente nodo
        this.first = this.first.next();
        //Retornamos el nodo que guardamos
        return temp;
    }

    // Método para eliminar un nodo con un valor específico en una lista enlazada
    public Node delete(Object val) {

        // Se empieza desde el primer nodo de la lista
        Node currentNode = this.first;
        Node previousNode = this.first;

        // Bucle para recorrer la lista hasta encontrar el nodo con el valor deseado
        while (!currentNode.value().equals(val)) {
            // Si llegamos al final de la lista y no encontramos el valor, retornamos null
            if (currentNode.next() == null) {
                return null;
            } else {
                // Avanzamos en la lista: el nodo actual pasa a ser el anterior
                previousNode = currentNode;
                currentNode = currentNode.next(); // y el siguiente nodo pasa a ser el actual
            }
        }

        // Si el nodo a eliminar es el primero de la lista
        if (currentNode == this.first) {
            // Se actualiza el puntero de "first" al siguiente nodo
            this.first = this.first.next();
        } else {
            // Si el nodo no es el primero, se "salta" el nodo actual
            // haciendo que el nodo anterior apunte al siguiente del nodo actual
            previousNode.setNext(currentNode.next());
        }

        // Retorna el nodo eliminado
        return currentNode;
    }

    // Método para imprimir el contenido de todos los nodos de una lista enlazada
    public void printContent() {

        // Se inicia desde el primer nodo de la lista
        Node currentNode = first;

        // Mensaje de encabezado en consola
        System.out.println("Mostrar elementos de una lista enlazada: ");

        // Se recorre la lista nodo por nodo hasta llegar al final (cuando currentNode es null)
        while (currentNode != null) {
            // Llama a un método del nodo para mostrar su contenido
            currentNode.showContent();

            // Avanza al siguiente nodo de la lista
            currentNode = currentNode.next();
        }
    }

    //Método para determinar si una lista enlazada está vacía
    public boolean isEmpty() {
        //evaluamos si el primer elemento de la lista enlazada está vacío
        return (this.first == null);
    }

    //Método para encontrar un valor en particular
    public Node contains(Object val) {
        //Se inicia desde el primer nodo de la lista
        Node currentNode = this.first;
        //Comparamos el nodo actual con el valor entregado
        while (!currentNode.value().equals(val)) {
            if (currentNode.next() == null) {
                return null;
            } else {
                currentNode = currentNode.next();
            }
        }

        return currentNode;
    }

    //Método en la lista enlazada que inserte un valor en cualquier lugar de la lista enlazada
    public Node insert(Object value, Object newValue) {
        Node currentNode = this.first; // Comenzamos desde el primer nodo

        // Creamos el nuevo nodo que queremos insertar
        Node newNode = new Node(value);

        // Recorremos la lista hasta encontrar el nodo cuyo valor sea igual a 'newValue'
        while (!currentNode.value().equals(newValue)) {
            if (currentNode.next() == null) {
                // Si llegamos al final de la lista sin encontrar el valor, retornamos null
                return null;
            } else {
                // Avanzamos al siguiente nodo
                currentNode = currentNode.next();
            }
        }

        // Insertamos el nuevo nodo después del nodo encontrado
        newNode.setNext(currentNode.next()); // El nuevo nodo apunta al siguiente nodo
        currentNode.setNext(newNode);        // El nodo actual apunta al nuevo nodo

        return newNode; // Retornamos el nodo insertado
    }


}
