package mapas.ejercicioConteoPalabras;

import java.util.*;

public class conteoPalabras {
    public static void main(String[] args) {
        //crear hashmap para almacena claves string y valores enteros
        HashMap<String, Integer> miMap = new HashMap<>();

        crearMap(miMap);  // crear un mapa a partir de la entrada del usuario
imprimirMap(miMap); // imprimir el mapa

        //Ejemplo de uso de un mapa con palabras
        //Si se quiere hacer un conteo de palabras, se puede usar el método put para añadir palabras al mapa
        //y el método get para obtener la cuenta de una palabra específica.
        //Por ejemplo, si se quiere contar cuántas veces aparece la palabra "hola", se puede hacer así:
        //miMap.put("hola", miMap.getOrDefault("hola", 0) + 1);

    }
    // crear un map a partir de la entrada del usuario
    public static void crearMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in); // crear un objeto Scanner para leer la entrada del usuario
        System.out.println("Escriba una cadena");
        String entrada = scanner.nextLine(); // leer la entrada del usuario
        String[] tokens = entrada.split(" "); // dividir la cadena en palabras usando el espacio como delimitador

        for(String token : tokens) {
         String palabra = token.toLowerCase(); // convertir la palabra a minúsculas

            //si el mapa contiene la palabra
            if(map.containsKey(palabra)){ //¿esta la palabra en el mapa?
                int cuenta = map.get(palabra); //obtiene la cuenta actual
                map.put(palabra, cuenta + 1); //incrementa la cuenta de la palabra

            }else{
                map.put(palabra, 1); //si no está en el mapa, la añade con una cuenta de 1
            }

        }
    }
    public static void imprimirMap(Map<String, Integer> map){
        Set <String> keys = map.keySet(); // obtener las claves del mapa

        //ordenar las claves alfabéticamente
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        //imprimir el mapa
   for (String key : sortedKeys) {
            int value = map.get(key); // obtener el valor asociado a la clave
            System.out.println("Palabra: " + key + " - Cuenta: " + value); // imprimir la palabra y su cuenta
        }
    }
}
