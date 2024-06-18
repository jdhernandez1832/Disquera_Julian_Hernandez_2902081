package com.example.Disquera.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Disquera")
public class Disquera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDisquera;

    @NotEmpty(message = "El NIT es obligatorio")
    @Column(length = 50, nullable = false)
    private String nitDisquera;

    @NotEmpty(message = "El nombre es obligatorio")
    @Column(length = 50, nullable = false)
    private String nombreDisquera;

    @NotEmpty(message = "El teléfono es obligatorio")
    @Column(length = 50, nullable = false)
    private String telefonoDisquera;

    @NotEmpty(message = "La dirección es obligatoria")
    @Column(length = 50, nullable = false)
    private String direccionDisquera;

    @NotNull(message = "El estado es obligatorio")
    @Column(nullable = false)
    private Boolean estadoDisquera;

    // Constructor, getters y setters

    public Disquera() {}

    public Disquera(Integer idDisquera, String nitDisquera, String nombreDisquera, String telefonoDisquera, String direccionDisquera, Boolean estadoDisquera) {
        this.idDisquera = idDisquera;
        this.nitDisquera = nitDisquera;
        this.nombreDisquera = nombreDisquera;
        this.telefonoDisquera = telefonoDisquera;
        this.direccionDisquera = direccionDisquera;
        this.estadoDisquera = estadoDisquera;
    }

    public Integer getIdDisquera() {
        return idDisquera;
    }

    public void setIdDisquera(Integer idDisquera) {
        this.idDisquera = idDisquera;
    }

    public String getNitDisquera() {
        return nitDisquera;
    }

    public void setNitDisquera(String nitDisquera) {
        this.nitDisquera = nitDisquera;
    }

    public String getNombreDisquera() {
        return nombreDisquera;
    }

    public void setNombreDisquera(String nombreDisquera) {
        this.nombreDisquera = nombreDisquera;
    }

    public String getTelefonoDisquera() {
        return telefonoDisquera;
    }

    public void setTelefonoDisquera(String telefonoDisquera) {
        this.telefonoDisquera = telefonoDisquera;
    }

    public String getDireccionDisquera() {
        return direccionDisquera;
    }

    public void setDireccionDisquera(String direccionDisquera) {
        this.direccionDisquera = direccionDisquera;
    }

    public Boolean getEstadoDisquera() {
        return estadoDisquera;
    }

    public void setEstadoDisquera(Boolean estadoDisquera) {
        this.estadoDisquera = estadoDisquera;
    }
    // Métodos adicionales
    public void listar() {}
    public void registrar() {}
    public void eliminar(int id) {}
    public void consultaId(int id) {}
    public void actualizar(int id) {}
    public void cambiarEstado() {}
}
