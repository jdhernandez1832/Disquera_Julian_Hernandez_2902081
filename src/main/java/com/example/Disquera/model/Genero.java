package com.example.Disquera.model;


public class Genero {

    
    private int idGenero;
    private String nombreGenero;
    private boolean estadoGenero;

    // Constructor
    public Genero() {
    }

    public Genero(int idGenero, String nombreGenero, boolean estadoGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
        this.estadoGenero = estadoGenero;
    }

    // Getters y Setters
    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public boolean isEstadoGenero() {
        return estadoGenero;
    }

    public void setEstadoGenero(boolean estadoGenero) {
        this.estadoGenero = estadoGenero;
    }

    // Métodos
    public void listar() {}
    public void registrar() {}
    public void eliminar(int id) {}
    public void consultaId(int id) {}
    public void actualizar(int id) {}
    public void cambiarEstado() {}
}
