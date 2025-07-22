package listas.listaEnlazada.inventario;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private final List<Product> products;

    public Inventory() {
        // Inicializamos la lista enlazada de productos
        products = new LinkedList<>();
    }

    //Metodo para agregar un nuevo producto al inventario
    public void newProduct(int id, String name, int existencia, double precio) {
        // Creamos un nuevo producto con los datos proporcionados
        Product product = new Product(id, name, existencia, precio);

        // Agregamos el producto a la lista enlazada
        boolean success = products.add(product);
        System.out.println("Producto agregado exitosamente." + success);

    }

    public void printProducts() {
        // Verificamos si la lista de productos está vacía
        if (products.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        }
        // Imprimimos los productos en la lista enlazada
        products.forEach(System.out::println);
    }

    public void addProduct(int id) {
        int productIndex = products.indexOf(new Product(id));
        Product product = products.get(productIndex);
        if (product != null) {
            System.out.println("Ingrese la cantidad a agregar al inventario: ");
            Scanner sc = new Scanner(System.in);
            int cantidad = sc.nextInt();
            product.setExistencia(product.getExistencia() + cantidad);
            System.out.println("Producto actualizado: " + product);
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }

    public void updateProductPrice(int id) {
        int productIndex = products.indexOf(new Product(id));
        Product product = products.get(productIndex);
        if (product != null) {
            System.out.println("Ingrese el nuevo precio: ");
            Scanner sc = new Scanner(System.in);
            double nuevoPrecio = sc.nextDouble();
            product.setPrecio(nuevoPrecio);
            System.out.println("Producto actualizado: " + product);
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }

    }

    public void deleteProduct(int id) {
        boolean success = products.removeIf(product -> product.getId() == id);
        if (success) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }
}
