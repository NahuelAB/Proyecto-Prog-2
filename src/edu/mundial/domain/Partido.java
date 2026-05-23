package edu.mundial.domain;
import edu.mundial.enums.TipoEvento;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partido{
    private LocalDate fecha;
    private LocalTime horario;
    private int duracion;
    private int tiempoAdicional;

    private List<Evento> eventos;

    public Partido(){
        this.fecha = null;
        this.horario = null;
        this.duracion = 0;
        this.tiempoAdicional = 0;
        this.eventos = null;
    }

    public Partido(LocalDate fecha, LocalTime horario, int duracion, int tiempoAdicional, Evento eventos){
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;

        this.eventos = new ArrayList<>();
    }

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

    public void nuevoEvento(TipoEvento tipo, int minuto){
        Evento evento = new Evento(tipo, minuto, this);
        eventos.add(evento);
    }

    public List<Evento> getEventos(){
        return eventos;
    }
}