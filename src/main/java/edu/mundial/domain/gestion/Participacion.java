package edu.mundial.domain.gestion;

import edu.mundial.domain.organizacion.Seleccion;

public class Participacion {
    //Atributos propios
    private boolean esLocal;
    public int cantidadGoles;
    public int cantidadTarjAmarilla;
    public int cantidadTarjRojas;

    //Clases asociadas
    private Seleccion seleccion;
    private Partido partido;

    public Participacion() {
        this(false, 0, 0, 0, null, null);
    }

    public Participacion(boolean esLocal, int cantidadGoles, int cantidadTarjAmarilla, int cantidadTarjRojas, Seleccion seleccion, Partido partido){
        this.esLocal = esLocal;
        this.cantidadGoles = cantidadGoles;
        this.cantidadTarjAmarilla = cantidadTarjAmarilla;
        this.cantidadTarjRojas = cantidadTarjRojas;
        this.seleccion = seleccion;
        this.partido = partido;
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

    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }


}
