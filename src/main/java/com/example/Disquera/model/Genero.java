package com.example.Disquera.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGenero;

    @NotEmpty(message = "El nombre del género es obligatorio")
    @Size(max = 50, message = "El nombre del género no puede tener más de 50 caracteres")
    @Column(length = 50, nullable = false)
    private String nombreGenero;

    @NotNull(message = "El estado del género es obligatorio")
    @Column(nullable = false)
    private Boolean estadoGenero;

    // Constructor
    public Genero() {}

    public Genero(int idGenero, String nombreGenero, Boolean estadoGenero) {
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

    public Boolean getEstadoGenero() {
        return estadoGenero;
    }

    public void setEstadoGenero(Boolean estadoGenero) {
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
