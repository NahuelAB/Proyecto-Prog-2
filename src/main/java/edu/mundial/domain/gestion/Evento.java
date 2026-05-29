package edu.mundial.domain.gestion;
import edu.mundial.enums.TipoEvento;
import edu.mundial.domain.persona.Jugador;

/**
 * Representa un suceso ocurrido durante un partido (Gol, Tarjeta, etc.).
 * Esta clase conecta el tiempo del partido con el protagonista del evento.
 */
public class Evento{
    private TipoEvento tipo;
    private int minuto;
    private Partido partido;

    //Relaciones
    public Jugador involucra;

    public Evento(){
        this(null, 0, null, null);
    }

    public Evento(TipoEvento tipo, int minuto, Partido partido,  Jugador involucra){
        this.tipo = tipo;
        this.minuto = minuto;
        this.partido = partido;
        this.involucra = involucra;
    }

    //Getters y Setters
    public TipoEvento getTipo(){
        return tipo;
    }

    public int getMinuto(){
        return minuto;
    }

    public Partido getPartido(){
        return partido;
    }

    public Jugador getInvolucra() {
        return involucra;
    }
    public void setInvolucra(Jugador involucra) {
        this.involucra = involucra;
    }
}
