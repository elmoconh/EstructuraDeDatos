package listas.listaEnlazada;

public class SimpleLinkedList {
    private Node first; //referencia al primer nodo de la lista

    public SimpleLinkedList(){
        this.first = null;
    }

    public void push(Object data){
        //este nuevo nodo será el primero de la lista
        Node newNode = new Node(data);
        //Ahora el nuevo nodo apunta al primer nodo de la lista
        newNode.setNext(this.first);
        this.first = newNode;
    }
    public Node pop(){
        //Si la lista está vacía
        if(this.first == null){
            return null;
        }
        //Guardamos el primer nodo de la lista
        Node temp = this.first;
        //Ahora el primer nodo de la lista será el siguiente nodo
        this.first = this.first.next();
        //Retornamos el nodo que guardamos
        return temp;
    }
    public Node delete(){

        //Si la lista está vacía
        if(this.first == null){
            return null;
        }
        //Guardamos el primer nodo de la lista
        Node temp = this.first;
        //Ahora el primer nodo de la lista será el siguiente nodo
        this.first = this.first.next();
        //Retornamos el nodo que guardamos
        return temp;
    }
}
