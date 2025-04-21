package listas.listaEnlazada;

public class Node {
    private Object data;
    private Node next;

      public Node (Object datos){
          //inicializamos el nodo con un valor
         this.data = datos;//asignamos el valor al nodo
     }
     public Object value(){
         return this.data;
     }

     public Node next(){
         return this.next;
     }

     public void setNext(Node nodo){
         this.next = nodo;
     }
     public void showContent(){
            System.out.println("Value: " +this.data);
     }
}
