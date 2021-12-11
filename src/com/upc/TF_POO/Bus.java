package com.upc.TF_POO;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    private int numeroBus;
    private List<Vecino> listaVecinos;
    private Asiento asiento;

    public Bus(int numeroBus, Asiento asiento) {
        this.numeroBus = numeroBus;
        this.asiento = asiento;
        this.listaVecinos = new ArrayList<>();
    }

    public int getNumeroBus() {
        return numeroBus;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public List<Vecino> getListaVecinos() {
        return listaVecinos;
    }

    public Vecino obtenerVecino(String dni){
        for( Vecino vecino : listaVecinos ){
            if ( vecino.getDni().equals(dni) ){
                return vecino;
            }
        }
        return null;
    }

    public int buscarVecino(String dni){
        List<Vecino> vecinosAux = new ArrayList<>();
        for(Vecino vecino :listaVecinos){
            if( vecino.getDni().equals(dni) ){
                vecinosAux.add(vecino);
            }
        }
        return vecinosAux.size();
    }

    public void registrarVecino(Vecino vecino){
        List<Vecino> vecinosAux = new ArrayList<>();
        if (vecino.esMayorDeEdad() && this.buscarVecino(vecino.getDni()) == 0 ){
            listaVecinos.add(vecino);
        }
    }

    public double promedioEdades(){
        double suma=0;
        for( Vecino vecino : listaVecinos ){
            suma = suma + vecino.obtenerEdad();
        }
        return (suma/listaVecinos.size());
    }

    public List vecinosConObsequio(){
        List<Vecino> vecinosAux = new ArrayList<>();
        for(Vecino vecino :listaVecinos){
            if( !vecino.obtenerObsequio().equals("") ){
                vecinosAux.add(vecino);
            }
        }
        return vecinosAux;
    }

    public double vecinosMiembrosSinObsequio(){
        double suma = 0;
        List<Vecino> vecinosMiembros = new ArrayList<>();
        for(Vecino vecino :listaVecinos){
            if( vecino.esMiembro() && vecino.obtenerObsequio().equals("") ){
                vecinosMiembros.add(vecino);
            }
        }

        for(Vecino vecino_ : vecinosMiembros){
            suma = suma + vecino_.obtenerEdad();
        }

        return (suma/vecinosMiembros.size());
    }


    @Override
    public String toString() {
        return "Bus{" +
                "numeroBus=" + numeroBus +
                ", asiento=" + asiento.getNumero() +
                ",\nlistaVecinos=" + listaVecinos +
                '}';
    }
}
