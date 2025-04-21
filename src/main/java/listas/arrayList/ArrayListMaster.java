package listas.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMaster {
    public static void main(String[] args) {
        //Las listas son una estructura de datos que nos permiten almacenar varios elementos,
        //pueden ser de cualquier tipo, duplicados o no y nulos dependiendo de la implementación que utilicemos.
        List<String> listaDeColores = new ArrayList<>();

        //Agregamos elementos a la lista
        listaDeColores.add("Amarillo");
        listaDeColores.add("Purpura");
        listaDeColores.add("Rojo");

        //Creamos una nueva lista a partir de la lista anterior
        List<String> elementos = new ArrayList<>(listaDeColores);

        //Iteración del ArrayList
        ListIterator<String> iterador = elementos.listIterator();
        System.out.println("Elementos de la lista: ");


        //Imprimimos la lista
        while (iterador.hasNext()) {
            System.out.println(iterador.next());

        }

        ListIterator <String> iterador2 = elementos.listIterator();
        while (iterador2.hasNext()) {
            if (iterador2.next().equals("Purpura")) {
                iterador2.remove();
            }
        }

        System.out.println("\nElementos de la lista: ");
        //Imprimimos la lista, pero si nos fijamos no imprime los elementos,
        // esto se debe a que el iterador ya no tiene elementos que recorrer
        while (iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }

        //Imprimimos la lista, pero esta vez usaremos un ciclo for para "forzar" la impresión
        System.out.println("\nElementos de la lista: ");
        for(ListIterator<String> iterador3 = elementos.listIterator(); iterador3.hasNext();){
            System.out.println(iterador3.next());
        }

    }

}
