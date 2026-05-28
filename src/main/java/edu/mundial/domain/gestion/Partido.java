package edu.mundial.domain.gestion;

import edu.mundial.domain.organizacion.Estadio;
import edu.mundial.domain.organizacion.Seleccion;
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

    //Relaciones
    public Estadio seDesarrollaEn;
    private List<Arbitraje> arbitrajes;
    private List<Evento> eventos;
    private List<Participacion> participaciones;
    public Fase corresponde;

    public Partido(){
        this(null, null, 0, 0, null, null, null, null, null);
    }

    public Partido(LocalDate fecha, LocalTime horario, int duracion, int tiempoAdicional, Estadio seDesarrollaEn, List<Arbitraje> arbitrajes, List<Evento> eventos, List<Participacion> participaciones, Fase corresponde){
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.seDesarrollaEn =  seDesarrollaEn;
        this.arbitrajes = arbitrajes;
        this.eventos = eventos;
        this.participaciones = participaciones;
        this.corresponde = corresponde;
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

    //No necesita de Setter debido a que es la duración del partido y debería ser Final una vez recibida.
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

    public Estadio getSeDesarrollaEn() { return seDesarrollaEn; }
    public void setSeDesarrollaEn(Estadio seDesarrollaEn) { this.seDesarrollaEn = seDesarrollaEn; }

    public List<Arbitraje> getArbitrajes() { return arbitrajes; }

    public List<Evento> getEventos(){
        return eventos;
    }

    //No necesita de Setter porque se podría editar de ésta forma y tener redundancia de participaciones.
    public List<Participacion> getParticipaciones() {
        return participaciones;
    }

    //PREGUNTAR SI HACE FALTA DEJAR EL GETTER Y SETTER DE CORRESPONDE; ES PUBLIC IGUALMENTE...
    public Fase getCorresponde(){
        return corresponde;
    }
    public void setCorresponde(Fase corresponde){
        this.corresponde = corresponde;
    }

    //              ---Métodos---

    //Metodo para agregar participaciones a la lista de participaciones.
    public void nuevaParticipacion(boolean esLocal, int cantidadGoles, int cantidadTarjAmarilla, int cantidadTarjRojas, Seleccion seleccion){
        if(this.participaciones == null) {
            this.participaciones = new ArrayList<>();
        }

        //Chequeo de que solo haya 2 selecciones.
        if(this.participaciones.size() >= 2){
            return;
        }

        //Seguro contra repetición de selecciones y repetición de locales y visitantes.
        for(Participacion p : participaciones){
            if(p.getSeleccion().equals(seleccion)){
                return;
            }

            if(p.isEsLocal() == esLocal){
                return;
            }
        }

        Participacion participacion = new Participacion(esLocal,cantidadGoles, cantidadTarjAmarilla, cantidadTarjRojas, seleccion);

        this.participaciones.add(participacion);
    }

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
        /*
        if(this.arbitrajes == null){
            this.arbitrajes = new ArrayList<>();
        }

        this.arbitrajes.add(arbitro);

        PREGUNTAR AL PROFESOR EN CASO DE 0 ARBITROS, YA QUE NO TIENE SENTIDO.
        */
    }
}