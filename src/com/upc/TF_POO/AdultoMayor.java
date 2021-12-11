package com.upc.TF_POO;

import java.util.Calendar;

public class AdultoMayor extends Vecino{

    public AdultoMayor(String dni, String nombres, String telefono, String estadoCivil, String fechaNacimiento) {
        super(dni, nombres, telefono, estadoCivil, fechaNacimiento);
    }

    @Override
    public boolean esAdultoMayor() {
        return true;
    }

    @Override
    public boolean esMiembro() {
        return false;
    }

    public int esMayor75(){
        Calendar d = Calendar.getInstance();
        int anioActual =  d.getWeekYear();
        return (anioActual - Integer.parseInt(this.getFechaNacimiento().substring(0,4)));
    }

    @Override
    public String obtenerObsequio() {
        if ( this.esMayor75() > 75 ){
            return "Bebida";
        }else{
            return "";
        }
    }

    public String toString() {
        return "Vecino: " +
                "dni='" + this.getDni() + '\'' +
                ", nombres='" + this.getNombres() + '\'' +
                ", telefono='" + this.getTelefono() + '\'' +
                ", estadoCivil='" + this.getEstadoCivil() + '\'' +
                ", fechaNacimiento='" + this.getFechaNacimiento() + '\'' +
                ", edad='" + this.obtenerEdad() + '\'' +
                "\nObsequio: " + obtenerObsequio()+ "\n";
    }


}
