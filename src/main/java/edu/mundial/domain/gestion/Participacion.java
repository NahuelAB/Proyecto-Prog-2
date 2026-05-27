package edu.mundial.domain.gestion;

import edu.mundial.domain.organizacion.Seleccion;

public class Participacion {
    private boolean esLocal;
    public int cantidadGoles;
    public int cantidadTarjAmarilla;
    public int cantidadTarjRojas;

    private Seleccion seleccion;

    public Participacion() {
        this(false, 0, 0, 0, null);
    }

    public Participacion(boolean esLocal, int cantidadGoles, int cantidadTarjAmarilla, int cantidadTarjRojas, Seleccion seleccion){
        this.esLocal = esLocal;
        this.cantidadGoles = cantidadGoles;
        this.cantidadTarjAmarilla = cantidadTarjAmarilla;
        this.cantidadTarjRojas = cantidadTarjRojas;
        this.seleccion = seleccion;
    }

    //Getters y Setters
    public boolean isEsLocal(){
        return esLocal;
    }
    public void setEsLocal(boolean esLocal){
        this.esLocal = esLocal;
    }

    public int getCantidadGoles(){
        return cantidadGoles;
    }
    public void setCantidadGoles(int cantidadGoles){
        this.cantidadGoles = cantidadGoles;
    }

    public int getCantidadTarjAmarilla() { return cantidadTarjAmarilla; }
    public void setCantidadTarjAmarilla(int cantidadTarjAmarilla) { this.cantidadTarjAmarilla = cantidadTarjAmarilla; }

    public int getCantidadTarjRojas() { return cantidadTarjRojas; }
    public void setCantidadTarjRojas(int cantidadTarjRojas) { this.cantidadTarjRojas = cantidadTarjRojas; }

    public Seleccion getSeleccion(){
        return seleccion;
    }
    public void setSeleccion(Seleccion seleccion){
        this.seleccion = seleccion;
    }

}
