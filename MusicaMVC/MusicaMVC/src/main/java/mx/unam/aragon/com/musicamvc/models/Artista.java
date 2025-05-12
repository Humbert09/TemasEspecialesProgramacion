package mx.unam.aragon.com.musicamvc.models;

import java.util.Objects;

public class Artista {
    private String nombre;
    private String genero;
    private Integer edad;
    private String descripcion;
    private String imagen;

    public Artista() {
    }

    public Artista(String nombre, String genero, Integer edad, String descripcion, String imagen) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return Objects.equals(nombre, artista.nombre) && Objects.equals(genero, artista.genero) && Objects.equals(edad, artista.edad) && Objects.equals(descripcion, artista.descripcion) && Objects.equals(imagen, artista.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, genero, edad, descripcion, imagen);
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}


