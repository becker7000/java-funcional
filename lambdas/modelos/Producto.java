package mx.tecgurus.lambdas.modelos;

import java.util.Objects;

public class Producto {

    private Integer id;
    private String nombre;
    private Double precio;

    public Producto(Integer id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id) && Objects.equals(nombre, producto.nombre) && Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio);
    }
}
