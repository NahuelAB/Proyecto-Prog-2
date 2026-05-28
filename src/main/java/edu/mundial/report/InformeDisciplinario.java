package edu.mundial.report;

import edu.mundial.domain.gestion.Partido;
import edu.mundial.domain.gestion.Evento;
import edu.mundial.domain.organizacion.Seleccion;
import edu.mundial.enums.TipoEvento;
import edu.mundial.domain.persona.Jugador;
import java.util.List;

/**
 * Clase encargada de generar reportes sobre las sanciones disciplinarias (tarjetas)
 * ocurridas durante el torneo, permitiendo filtrar por jugador o por selección nacional.
 */
public class InformeDisciplinario{

    /**
     * Genera y muestra por consola el listado de tarjetas recibidas por un jugador específico.
     * @param partidos Lista global de partidos donde se buscarán los eventos.
     * @param jugador El jugador sobre el cual se desea obtener el informe.
     */
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

    /**
     * Genera y muestra por consola el listado de tarjetas recibidas por todos los integrantes
     * de una selección determinada.
     * @param partidos Lista global de partidos donde se buscarán los eventos.
     * @param seleccion La selección nacional sobre la cual se genera el informe.
     */
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
    /**
     * Determina si un tipo de evento corresponde a una sanción disciplinaria.
     * Incluye Tarjeta Amarilla, Tarjeta Roja y Doble Amarilla.
     * @param tipo El tipo de evento a evaluar.
     * @return true si es una tarjeta, false en caso contrario.
     */
    public boolean esTarjeta(TipoEvento tipo){
        return tipo == TipoEvento.TarjetaAmarilla || tipo == TipoEvento.TarjetaRoja || tipo == TipoEvento.DobleAmarilla;
    }

    /**
     * Metodo auxiliar para estandarizar la salida de los eventos sancionatorios por consola.
     * @param evento El objeto evento que contiene la información de la tarjeta.
     */
    public void imprimirEvento(Evento evento){
        System.out.println("Jugador: " + evento.getInvolucra().getNombre());
        System.out.println("Sancion: " + evento.getTipo());
        System.out.println("Minuto: " + evento.getMinuto());
        System.out.println("------------------------");
    }
}


