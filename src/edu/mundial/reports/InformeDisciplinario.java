package edu.mundial.reports;

import edu.mundial.domain.Partido;
import edu.mundial.domain.Evento;
import edu.mundial.enums.TipoEvento;
import edu.mundial.model.personas.Jugador;
import java.util.List;

public class InformeDisciplinario{
    public void generarReport(List<Partido> partidos){
        System.out.println("------------------------");
        System.out.println("Reporte de disciplinario");
        System.out.println("------------------------");

        //For que recorre los partidos
        for(int i = 0; i < partidos.size(); i++){
            Partido partido = partidos.get(i);
            List<Evento> eventos = partido.getEventos();

            // For que recorre los eventos de cada partido
            for(int j = 0; j < eventos.size(); j++){
                Evento evento = eventos.get(j);

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
