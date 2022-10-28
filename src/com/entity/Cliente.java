package com.entity;

public class Cliente {

    private String nombre;
    private String cedula;
    private boolean vigencia;

    public Cliente(String nombre, String cedula, boolean vigencia) {
        this.setNombre(nombre);
        this.setCedula(cedula);
        this.setVigencia(vigencia);
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
        this.validarCedula(cedula);
        this.cedula = cedula;
    }

    public boolean isVigencia() {
        return vigencia;
    }
    public String getVigencia(){
        if (this.isVigencia()){
            return "Vigente";
        }else {
            return "No vigentre";
        }
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    private void validarCedula(String cedula) {
        if (cedula.length() !=10){
            throw new IllegalArgumentException("EL LARGO DE LA CEDULA DEBE SER DE 10");
        }
        if("-".indexOf(cedula.charAt(8)) == -1){
            throw new IllegalArgumentException("CEDULA DEBE CONTENER GUION MEDIO (-)");
        }
        if("1234567890Kk".indexOf(cedula.charAt(9)) == -1){
            throw new IllegalArgumentException("DIGITO VERIFICADOR DEBE ESTAR ENTRE 1234567890K");
        }
    }

    //INHABILITA A UN CLIENTE A ARRENDAR UN VEHICULO
    public void deshablilitar(){
        this.setVigencia(false);
        System.out.println("CLIENTE DESHABILITADO");
    }

    public static void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", vigencia=" + vigencia +
                '}';
    }
}
