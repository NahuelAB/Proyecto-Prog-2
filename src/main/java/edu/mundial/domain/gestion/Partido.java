package edu.mundial.domain.gestion;

import edu.mundial.domain.organizacion.Estadio;
import edu.mundial.domain.gestion.Arbitraje;
import edu.mundial.domain.persona.Arbitro;
import edu.mundial.enums.TipoEvento;
import edu.mundial.domain.persona.Jugador;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Partido{
    private LocalDate fecha;
    private LocalTime horario;
    private int duracion;
    private int tiempoAdicional;

    private Estadio seDesarrollaEn;

    private List<Arbitraje> arbitrajes;

    private List<Evento> eventos;

    public Partido(){
        this(null, null, 0, 0, null, null, null);
    }

    public Partido(LocalDate fecha, LocalTime horario, int duracion, int tiempoAdicional, Estadio seDesarrollaEn, List<Arbitraje> arbitrajes, List<Evento> eventos){
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.seDesarrollaEn =  seDesarrollaEn;
        this.arbitrajes = arbitrajes;
        this.eventos = eventos;
    }

    //Getters y Setters
    public LocalDate getFecha(){
        return fecha;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public LocalTime getHorario(){
        return horario;
    }

    public void setHorario(LocalTime horario){
        this.horario = horario;
    }

    public int getDuracion(){
        return duracion;
    }

    public int getTiempoAdicional(){
        return tiempoAdicional;
    }

    public void setTiempoAdicional(int tiempoAdicional) {
        if (tiempoAdicional >= 0) {
            this.tiempoAdicional = tiempoAdicional;
        }
    }

    public List<Arbitraje> getArbitrajes() { return arbitrajes; }

    public Estadio getSeDesarrollaEn() { return seDesarrollaEn; }

    public void setSeDesarrollaEn(Estadio seDesarrollaEn) { this.seDesarrollaEn = seDesarrollaEn; }

    //Metodo para agregar eventos a la lista de eventos.
    public void nuevoEvento(TipoEvento tipo, int minuto, Jugador involucra){
        if(this.eventos == null){
            this.eventos = new ArrayList<>();
        }
        Evento evento = new Evento(tipo, minuto, this, involucra);
        this.eventos.add(evento);
    }

    //Metodo para agregar arbitros a la lista del partido.
    public void addArbitro(Arbitraje arbitro) {
        if(this.arbitrajes == null){
            this.arbitrajes = new ArrayList<>();
        }
        this.arbitrajes.add(arbitro);
    }

    public List<Evento> getEventos(){
        return eventos;
    }
}