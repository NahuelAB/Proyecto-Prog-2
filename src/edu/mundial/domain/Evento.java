package edu.mundial.domain;
import edu.mundial.enums.TipoEvento;

public class Evento{
    private TipoEvento tipo;
    private int minuto;
    private Partido partido;

    public Evento(){
        this.tipo = null;
        this.minuto = 0;
        this.partido = null;
    }

    public Evento(TipoEvento tipo, int minuto, Partido partido){
        this.tipo = tipo;
        this.minuto = minuto;
        this.partido = partido;
    }

    public TipoEvento getTipo(){
        return tipo;
    }

    public int getMinuto(){
        return minuto;
    }

    public Partido getPartido(){
        return partido;
    }
}
