package dev.el_nico.dam2_ad_p3.modelo;

public class Centro {
    private int codigo;
    private String nombre;
    private String director;
    private String direccion;
    private String localidad;
    private String provincia;

    public Centro() {}
    
    public Centro(int codigo, String nombre, String director, String direccion, String localidad, String provincia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }    

    public static class Codigo {
        private Codigo() {}
        public static final int COD_ITACA = 0,
                                COD_MONTE = 1;
    }
}
