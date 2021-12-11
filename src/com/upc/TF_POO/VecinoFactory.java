package com.upc.TF_POO;

public class VecinoFactory {

    public Vecino crear(String tipo, String... args){
        if(tipo.equals("AdultoMayor")){
            return new AdultoMayor(args[0], args[1], args[2], args[3], args[4]);
        }else if(tipo.equals("MiembroClub")){
            return new MiembroClub(args[0], args[1], args[2], args[3], args[4]);
        }
        return null;
    }



}
