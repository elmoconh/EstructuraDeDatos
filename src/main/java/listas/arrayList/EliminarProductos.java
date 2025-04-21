package listas.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarProductos {
    private static final Logger logger = LogManager.getLogger(EliminarProductos.class);


    private static Producto[] obtenerProductos() {
        return new Producto[]{
                new Producto("Adidas", "Blanco", "Superstar", "7"),
                new Producto("Nike","Azul", "Air Force 1", "8"),
                new Producto("Puma","Negro","Prueba", "M")
        };
    }


    public static void main (String[] args){
        List <Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
        String[] marcas = {"adidas", "nike"};
        logger.error("Productos actuales: {}", productos.size());
        eliminarProductos(productos, Arrays.stream(marcas).toList());
    }

    public static void eliminarProductos(List<Producto> productos, List<String> marcas){
        List<String> marcasUpperCase = marcas.stream().map(String::toUpperCase).toList();
        productos.removeIf(producto -> marcasUpperCase.contains(producto.getMarca().toUpperCase()));
        logger.error("Productos después de la eliminación:");
        productos.forEach(producto -> logger.error (producto.toString()));
    }



    static class Producto {
        private String marca;
        private String color;
        private String modelo;
        private String talla;

        public Producto(String marca, String color, String modelo, String talla) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
            this.talla = talla;

        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        @Override
        public String toString() {
            return "Producto{" +
                    "marca='" + marca + '\'' +
                    ", color='" + color + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", talla='" + talla + '\'' +
                    '}';
        }
    }
}
