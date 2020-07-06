package cl.talentodigital.catalogocursos;

public class Curso {

    private String nombre;
    private String descripcion;
    private String cantidadAlumnos;


    public Curso(String nombre, String descripcion, String cantidadAlumnos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadAlumnos = cantidadAlumnos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(String cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }
}



