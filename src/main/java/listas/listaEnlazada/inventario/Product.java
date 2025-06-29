package listas.listaEnlazada.inventario;


public class Product {
    private int id;
    private String name;
    private int existencia;
    private double precio;

    //constructor por defecto
    public Product(int id, String name, int existencia, double precio) {
        this.id = id;
        this.name = name;
        this.existencia = existencia;
        this.precio = precio;
    }

    //constructor para buscar un producto por ID
    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", existencia=" + existencia +
                ", precio=" + precio +
                '}';
    }
}
