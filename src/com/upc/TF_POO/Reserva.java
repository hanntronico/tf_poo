package com.upc.TF_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reserva {

    private String fecha;
    private Bus bus;
    private Vecino vecino;
    private Asiento asiento;

    public Reserva(String fecha, Bus bus, Vecino vecino, Asiento asiento) {
        this.fecha = fecha;
        this.bus = bus;
        this.vecino = vecino;
        this.asiento = asiento;
    }

//    public void asignarAsientoASala(String codigoSala, Asiento asiento) throws Exception {
//        Sala sala = buscarSala(codigoSala);
//        if(sala != null){
//            sala.registrarAsientos(asiento);
//        }else{
//            throw new Exception("Código de Sala inválido");
//        }
//    }

    public Vecino buscarVecino(String dni) {
        for(Vecino vecino : bus.getListaVecinos()){
            if( vecino.getDni().equals(dni) ){
                return vecino;
            }
        }
        return null;
    }

    public void encontrarVecinoSegunDNI(String dni) throws Exception{
        Vecino vecino = buscarVecino(dni);
        if(vecino != null){
            this.bus.getListaVecinos();
        }else{
            throw new Exception("Código de Sala inválido");
        }
    }


    public Bus listarPasajerosPorBus(String fecha, int numeroBus){
        if( this.fecha.equals(fecha) && this.bus.getNumeroBus() == numeroBus ){
            return this.bus;
        }else{
            return null;
        }
    }

//    public void asignarAsientoAVecino(Vecino vecino, Asiento asiento) throws Exception{
//        Vecino vecinoAux = buscarVecino( vecino.getDni() );
//        if( vecino != null){
////            vecino.asignarAsiento(asiento);
//        }else{
//            throw new Exception("Dni de Vecino inválido");
//        }
//    }

}
