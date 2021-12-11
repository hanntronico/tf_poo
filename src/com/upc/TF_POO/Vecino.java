package com.upc.TF_POO;

import java.util.Calendar;

public abstract class Vecino {

    private String dni;
    private String nombres;
    private String telefono;
    private String estadoCivil;
    private String fechaNacimiento;

    public Vecino(String dni, String nombres, String telefono, String estadoCivil, String fechaNacimiento) {
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract String obtenerObsequio();

    public abstract boolean esAdultoMayor();
    public abstract boolean esMiembro();

    public boolean esMayorDeEdad(){
        Calendar d = Calendar.getInstance();
        int anioActual =  d.getWeekYear();
        int edad = 0;
        edad =  (anioActual - Integer.parseInt(this.getFechaNacimiento().substring(0,4)));

        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    public double obtenerEdad(){
        Calendar d = Calendar.getInstance();
        int anioActual =  d.getWeekYear();
        return (anioActual - Integer.parseInt(this.getFechaNacimiento().substring(0,4)));

    }

}
