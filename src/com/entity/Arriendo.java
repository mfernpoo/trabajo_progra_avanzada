package com.entity;

import java.time.LocalDate;

public class Arriendo {

    private int numero;
    private LocalDate fecha_arriendo;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int monto;
    private int dias;

    public Arriendo(int numero, LocalDate fecha_arriendo, Vehiculo vehiculo, Cliente cliente, int monto, int dias) {
        this.numero = numero;
        this.fecha_arriendo = fecha_arriendo;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.monto = monto;
        this.dias = dias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFecha_arriendo() {
        return fecha_arriendo;
    }

    public void setFecha_arriendo(LocalDate fecha_arriendo) {
        this.fecha_arriendo = fecha_arriendo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
