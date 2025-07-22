package pilasColas;

import java.util.Stack;

public class PruebaStack {
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>();
        pila.push(12L);
        pila.push(3.14F);
        imprimirPila(pila);
    }
    static void imprimirPila(Stack<Number> pila) {
        if (pila.isEmpty()){
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("El elemento en la cima de la pila es: " + pila.peek());
            System.out.println("Los elementos de la pila son: "+ pila);
        }
    }
}
