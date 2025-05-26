package listas.listaEnlazada;

public class LinkedListApp {

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(1.23);
        list.push(2.3);
        list.printContent();
        list.isEmpty();
        list.insert(2.4, 2.3);
        list.printContent();
        
        Node verify = list.contains(2.5);
        if(verify != null){
            System.out.println("El valor existe");
        }else{
            System.out.println("El valor no Existe");
        }
        
    }
}
