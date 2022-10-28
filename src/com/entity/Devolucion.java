package com.entity;

import java.time.LocalDate;

public class Devolucion {

    private LocalDate fecha_devolucion;
    private Vehiculo autoRecibido;
    private Arriendo arriendo;

    public Devolucion(Vehiculo autoRecibido,Arriendo arriendo) {
        this.setAutoRecibido(autoRecibido);
        this.setArriendo(arriendo);
        this.setFecha_devolucion(arriendo.getFecha_arriendo(),arriendo.getDias());
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion, int dias) {
        LocalDate diaDevolucion = fecha_devolucion.plusDays(dias);
        this.fecha_devolucion = diaDevolucion;
    }

    public Vehiculo getAutoRecibido() {
        return autoRecibido;
    }

    public void setAutoRecibido(Vehiculo autoRecibido) {
        this.autoRecibido = autoRecibido;
    }

    public Arriendo getArriendo() {
        return arriendo;
    }

    public void setArriendo(Arriendo arriendo) {
        this.arriendo = arriendo;
    }

    public boolean devolver(){
        if (this.compareVehiculo()){
            this.getArriendo().devolver();
            System.out.println("VEHICULO DEVUELTO");
            return true;
        }
        System.err.println("VEHICULO ENTREGADO NO CONCUERDA CON EL VEHICULO ARRENDADO");
        return false;
    }

    public static void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    public boolean compareVehiculo(){
       return this.getAutoRecibido().getPatente()
               .equals(this.getArriendo().getVehiculo().getPatente())
               && this.getAutoRecibido().getMarca()
                .equals(this.getArriendo().getVehiculo().getMarca())
               && this.getAutoRecibido().getModelo()
               .equals(this.getArriendo().getVehiculo().getModelo())
               && this.getAutoRecibido().getAnio_fabricacion() ==
               this.getArriendo().getVehiculo().getAnio_fabricacion();
    }

    @Override
    public String toString() {
        return "Devolucion{" +
                "fecha_devolucion=" + fecha_devolucion +
                ", autoRecibido=" + autoRecibido +
                ", arriendo=" + arriendo +
                '}';
    }
}
