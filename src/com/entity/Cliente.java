package com.entity;

public class Cliente {

    private String nombre;
    private String cedula;
    private boolean vigencia;

    public Cliente(String nombre, String cedula, boolean vigencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.vigencia = vigencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
}
