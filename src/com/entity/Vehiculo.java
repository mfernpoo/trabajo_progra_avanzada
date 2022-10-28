package com.entity;

public class Vehiculo {

    private String patente;
    private String marca;
    private int anio_fabricacion;
    private String modelo;
    private char condicion;

    public Vehiculo() {}

    public Vehiculo(String patente, String marca, int anio_fabricacion, String modelo, char condicion) {
        this.validarPatente(patente.toUpperCase());
        this.setMarca(marca);
        this.setAnio_fabricacion(anio_fabricacion);
        this.setModelo(modelo);
        this.setCondicion(condicion);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente.length() != 8) {
            throw new IllegalArgumentException("EL LARGO DE LA PATENTE DEBE SER DE 8");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.esMayuscula(marca,"marca");
        this.marca = marca;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        if (anio_fabricacion < 2000) {
            throw new IllegalArgumentException("EL AÑO DE FABRICACIÓN DEBE SER MAYOR O IGUAL AL AÑO 2000");
        }
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.esMayuscula(modelo,"modelo");
        this.modelo = modelo;
    }

    public char getCondicion() {
        return condicion;
    }

    public String getCondicionVehiculo() {
        return switch (this.getCondicion()){
            case 'D' -> "Disponible";
            case 'A' -> "Arrendado";
            case 'M' -> "En mantencion";
            default -> throw new IllegalStateException("Unexpected value: " + this.getCondicion());
        };
    }

    public void setCondicion(char condicion) {
        if (condicion != 'A' && condicion != 'D' && condicion != 'M') {
            throw new IllegalArgumentException("LA CONDICIÓN DEL VEHÍCULO NO ES VÁLIDA");
        }
        this.condicion = condicion;
    }

    public void validarPatente(String patente){
        this.esMayuscula(patente,"patente");
        if (patente.length() != 8){
            throw new IllegalArgumentException("EL LARGO DE LA PATENTE DEBE SER DE LARGO 8");
        }
        this.setPatente(patente);
    }

    private void esMayuscula(String elemento,String valor) {
        for(char caracter : elemento.toCharArray()){
            if (!Character.isSpaceChar(caracter) && Character.isLetter(caracter)){
                if (!Character.isUpperCase(caracter)){
                    throw new IllegalArgumentException(valor.concat(" DEBE ESCRIBIRSE EN MAYÚSCULA"));
                }
            }
        }
    }

    /*A= arrendado
    * D= disponible
    * M= mantencion*/
    public void enMantencion(){
        if(this.condicion == 'A'){
            throw new IllegalArgumentException("VEHICULO EN ARRIENDO, NO SE PUEDE DAR MANTENCION");
        }
        this.setCondicion('M');
        System.out.println("VEHICULO EN MANTENCION");
    }

    public void disponible(){
        if(this.condicion != 'A' && this.condicion != 'M'){
            throw new IllegalArgumentException("VEHICULO YA SE ENCUENTRA DISPONIBLE");
        }
        this.setCondicion('D');
        System.out.println("VEHICULO DISPONIBLE");
    }

    public static void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", anio_fabricacion=" + anio_fabricacion +
                ", modelo='" + modelo + '\'' +
                ", condicion=" + condicion +
                '}';
    }
}
