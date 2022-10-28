package com.entity;

import java.time.LocalDate;

public class Arriendo {

    private int numero;
    private LocalDate fecha_arriendo;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int monto;
    private int dias;
    private Devolucion devolucion;

    public Arriendo(int numero, LocalDate fecha_arriendo, Vehiculo vehiculo, Cliente cliente, int monto, int dias) {
        this.setNumero(numero);
        this.setFecha_arriendo(fecha_arriendo);
        this.setVehiculo(vehiculo);
        this.setCliente(cliente);
        this.setMonto(monto);
        this.setDias(dias);
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
        if (dias >= 1 && dias <= 10) {
            this.dias = dias;
        }else{
            throw new IllegalArgumentException("DÍAS DEBE SER COMO MÍNiMO 1 Y MÁXIMO 10");
        }
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    private boolean validarArriendo() {
        if (this.cliente.isVigencia() && this.getVehiculo().getCondicion() == 'D') {
            return true;
        }
        return false;
    }

    public boolean arrendar() {
        if (this.validarArriendo()) {
            this.getVehiculo().setCondicion('A');
            System.out.println("AUTO ARRENDADO");
        }
        return false;
    }

    public boolean devolver() {
        if (this.getVehiculo().getCondicion() == 'A' && this.getCliente().isVigencia()) {
            this.getVehiculo().setCondicion('D');
            return true;
        }
        return false;
    }

    public int calcularMonto() {
        return this.getDias() * this.getMonto();
    }

    public static void mensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void generarTicket(){
        System.out.println( """ 
                ----------------------------------------
                TICKET ARRIENDO DE VEHÍCULO
                - NÚMERO DE ARRIEDO: %d
                - VEHÍCULO         : %s %s %s 
                - PRECIO DIARIO    : $%d
                - FECHA            : %s   
                - CLIENTE          : %s/%s 
                - DÍAS             : %d días   
                - A PAGAR          : $%d
                
                ______________
                FIRMA CLIENTE 
                ----------------------------------------
                """
                .formatted(this.getNumero(),
                        this.getVehiculo().getPatente(),
                        this.getVehiculo().getMarca(),
                        this.getVehiculo().getModelo(),
                        this.getMonto(),
                        this.getFecha_arriendo(),
                        this.getCliente().getCedula(),
                        this.getCliente().getNombre(),
                        this.getDias(),
                        this.calcularMonto()
                        ));
    }
}
