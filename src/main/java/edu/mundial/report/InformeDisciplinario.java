package edu.mundial.report;

import edu.mundial.domain.gestion.Partido;
import edu.mundial.domain.gestion.Evento;
import edu.mundial.enums.TipoEvento;
import edu.mundial.domain.persona.Jugador;
import java.util.List;

public class InformeDisciplinario{
    public void generarReport(List<Partido> partidos){
        System.out.println("------------------------");
        System.out.println("Reporte de disciplinario");
        System.out.println("------------------------");

        //For que recorre los partidos
        for(Partido partido : partidos){
            List<Evento> eventos = partido.getEventos();

            // For que recorre los eventos de cada partido
            for(Evento evento : eventos){
                TipoEvento tipo = evento.getTipo();

                if (evento.getTipo() == TipoEvento.TarjetaAmarilla ||
                        evento.getTipo() == TipoEvento.TarjetaRoja){

                    Jugador jugador = evento.getInvolucra();

                    System.out.println("Jugador: " + jugador.getNombre());
                    System.out.println("Sancion: " + evento.getTipo());
                    System.out.println("Minuto: " + evento.getMinuto());
                    System.out.println("------------------------");
                }
            }
        }
    }
}
