package com.entity;

public class Cliente {

    private String nombre;
    private String cedula;
    private boolean vigencia;

    public Cliente(String nombre, String cedula, boolean vigencia) {
        this.nombre = nombre;
        this.setCedula(cedula);
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
        this.validarCedula(cedula);
        this.cedula = cedula;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    private void validarCedula(String cedula) {
        if (cedula.length() !=10){
            throw new IllegalArgumentException("EL LARGO DE LA CEDULA DEBE SER DE 10");
        }
        if(!"-".equals(cedula.charAt(8))){
            throw new IllegalArgumentException("CEDULA DEBE CONTENER GUION MEDIO (-)");
        }
        if("1234567890K".indexOf(cedula.charAt(9)) == -1){
            throw new IllegalArgumentException("DIGITO VERIFICADOR DEBE ESTAR ENTRE 1234567890K");
        }
    }

    //INHABILITA A UN CLIENTE A ARRENDAR UN VEHICULO
    public void deshablilitar(){
        this.setVigencia(false);
        System.out.println("CLIENTE DESHABILITADO");
    }
}
