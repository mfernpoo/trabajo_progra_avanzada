package com.entity;

import java.time.LocalDate;

public class Devolucion {

    private LocalDate fecha_devolucion;

    public Devolucion(LocalDate fecha_arriendo,int dias) {
        this.setFecha_devolucion(fecha_arriendo,dias);
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_arriendo, int dias) {
        LocalDate diaDevolucion = fecha_arriendo.plusDays(dias);
        this.fecha_devolucion = diaDevolucion;
    }

    public static void mensaje(String mensaje){
        System.out.println(mensaje);
    }

}
