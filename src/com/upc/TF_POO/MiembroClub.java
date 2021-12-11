package com.upc.TF_POO;

public class MiembroClub extends Vecino{

    public MiembroClub(String dni, String nombres, String telefono, String estadoCivil, String fechaNacimiento) {
        super(dni, nombres, telefono, estadoCivil, fechaNacimiento);
    }

    @Override
    public String obtenerObsequio() {
        if(this.getEstadoCivil().equals("CASADO")){
            return "Chocolate Sublime";
        }else{
            return "";
        }
    }

    @Override
    public boolean esMiembro() {
        return true;
    }

    @Override
    public boolean esAdultoMayor() {
        return false;
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
