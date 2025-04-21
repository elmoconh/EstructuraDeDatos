package listas.listaEnlazada;

public class LinkedListMaster {
    //las listas enlazadas son una estructura de datos que nos permiten almacenar varios elementos,
    //pueden ser de cualquier tipo, duplicados o no y nulos dependiendo de la implementación que utilicemos.

    public static void main(String[] args) {
        SimpleLinkedList lista = new SimpleLinkedList();
        //Agregamos elementos a la lista
        lista.push("Amarillo");
        lista.push("Purpura");
        lista.push("Rojo");

        //Imprimimos la lista
        Node nodo = lista.pop();
        while (nodo != null) {
            nodo.showContent();
            nodo = lista.pop();
        }
    }
}
