package edu.mundial.report;

import edu.mundial.domain.gestion.Partido;
import edu.mundial.domain.gestion.Evento;
import edu.mundial.domain.organizacion.Seleccion;
import edu.mundial.enums.TipoEvento;
import edu.mundial.domain.persona.Jugador;
import java.util.List;

public class InformeDisciplinario{

    // Reporte Disciplinario por Jugador
    public void generarReportPorJugador(List<Partido> partidos, Jugador jugador){
        System.out.println("------------------------");
        System.out.println("Reporte de disciplinario de " + jugador.getNombre());
        System.out.println("------------------------");

        //For que recorre los partidos
        for (Partido partido : partidos) {
            for (Evento evento : partido.getEventos()) {   //For que recorre los eventos de cada partido
                if (esTarjeta(evento.getTipo())) {  // Se pregunta si es tarjeta llamando al metodo esTarjeta
                    if(evento.getInvolucra() == jugador){  // getInvolucra: evalúa la relación entre evento y jugador
                        imprimirEvento(evento); // Llama al metodo ImprimirEvento
                    }
                }
            }
        }
    }

    public void generarReportPorSeleccion(List<Partido> partidos, Seleccion seleccion){
        System.out.println("------------------------");
        System.out.println("Reporte de disciplinario: Seleccion de " + seleccion.getNombreFederacion());
        System.out.println("------------------------");

        for (Partido partido : partidos) {
            for (Evento evento : partido.getEventos()) {
                if (esTarjeta(evento.getTipo())) {
                    if(evento.getInvolucra().getIntegra() == seleccion){ //getIntegra: verifica si el jugador pertenece al objeto Selección recibido por parámetro.
                        imprimirEvento(evento);
                    }
                }
            }
        }
    }
    // Metodo auxiliar para evitar repetir código
    public boolean esTarjeta(TipoEvento tipo){
        return tipo == TipoEvento.TarjetaAmarilla || tipo == TipoEvento.TarjetaRoja;
    }
    // Metodo auxiliar para evitar repetir código
    public void imprimirEvento(Evento evento){
        System.out.println("Jugador: " + evento.getInvolucra().getNombre());
        System.out.println("Sancion: " + evento.getTipo());
        System.out.println("Minuto: " + evento.getMinuto());
        System.out.println("------------------------");
    }
}


