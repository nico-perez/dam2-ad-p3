package dev.el_nico.dam2_ad_p3.modelo;

public class Asignatura {
    private int codigo;
    private String nombre;

    public Asignatura() {}

    public Asignatura(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
