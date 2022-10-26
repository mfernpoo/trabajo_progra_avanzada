package com.entity;

public class Vehiculo {

    private String patente;
    private String marca;
    private int anio_fabricacion;
    private String modelo;
    private char condicion;

    public Vehiculo() {}

    public Vehiculo(String patente, String marca, int anio_fabricacion, String modelo, char condicion) {
        this.patente = patente;
        this.marca = marca;
        this.anio_fabricacion = anio_fabricacion;
        this.modelo = modelo;
        this.condicion = condicion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }

    public void validarPatente(String patente){
        if (patente.length() == 8){
            this.setPatente(patente);
        }
    }
}
