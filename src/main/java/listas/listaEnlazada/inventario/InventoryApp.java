package listas.listaEnlazada.inventario;

import java.util.Scanner;

public class InventoryApp {

    private Scanner sc;
    private Inventory inventory;

    public static void main(String[] args) {
        InventoryApp app = new InventoryApp();
        app.init();
    }

    public void init() {
        sc = new Scanner(System.in);
         inventory = new Inventory();
        int op;

        do {
            System.out.println("\n\n\t Menú \t");
            System.out.println("---Manejo de Inventario---");
            System.out.println("1.- Nuevo Producto: ");
            System.out.println("2.- Agregsar Producto al Inventario: ");
            System.out.println("3.- Eliminar Producto: ");
            System.out.println("4.- Actualizar precio de Producto: ");
            System.out.println("5.- Mostrar lista de Productos: ");
            System.out.println("6.- Salir: ");
            System.out.print("Seleccione una opción: ");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProductPrize();
                    break;
                case 5:
                    printProducts();
                    break;

            }
        } while (op != 6);
    }

    private void newProduct() {
        System.out.println("ID del Producto: ");
        int ID = sc.nextInt();

        System.out.println("Nombre del Producto: ");
        String name = sc.next();

        System.out.println("Existencias inicial del Producto: ");
        int existencia = sc.nextInt();

        System.out.println("Precio del Producto: ");
        double precio = sc.nextDouble();
        inventory.newProduct(ID, name, existencia, precio);
    }

    private void addProduct() {
        System.out.println("ID del Producto: ");
        int ID = sc.nextInt();
        inventory.addProduct(ID);
    }

    private void updateProductPrize() {
    }

    private void deleteProduct() {
    }

    private void printProducts() {
        inventory.printProducts();
    }

}
