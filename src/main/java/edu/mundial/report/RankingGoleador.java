package edu.mundial.report;

import edu.mundial.domain.persona.Jugador;
import edu.mundial.domain.gestion.Evento;
import edu.mundial.enums.TipoEvento;
import edu.mundial.domain.organizacion.Seleccion;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Clase encargada de generar el informe de Ranking de Goleadores.
 * Utiliza la relación directa entre Jugador y Eventos.
 */
public class RankingGoleador {

    /**
     * Genera el ranking de mayor a menor a partir de una lista de jugadores.
     * @param jugadores Lista global de jugadores.
     */
    public void generarInforme(List<Jugador> jugadores) {
        // 1. Lista auxiliar para guardar jugadores.
        List<GoleadorAux> ranking = new ArrayList<>();

        // Se Buscan goles jugador por jugador mediante el recorrido
        for (Jugador j : jugadores) {
            int contadorGoles = 0;

            // Accedemos a la lista de eventos que ya tiene cada jugador
            for (Evento e : j.getEventos()) {
                // Filtramos por los tipos de gol definidos en el enumerador TipoEvento
                if (e.getTipo() == TipoEvento.Gol || e.getTipo() == TipoEvento.PenalConvertido) {
                    contadorGoles++;
                }
            }

            // Solo se incluyen en el ranking a quienes marcaron goles
            if (contadorGoles > 0) {
                // Se guarda el nombre, los goles y su selección
                ranking.add(new GoleadorAux(j.getNombre(), contadorGoles, j.getIntegra()));
            }
        }

        // 2. Se usa Comparator para comparar los goles de mayor a menor.
        ranking.sort(new Comparator<GoleadorAux>() {
            @Override
            public int compare(GoleadorAux g1, GoleadorAux g2) {
                return Integer.compare(g2.goles, g1.goles); //Se retorna un num entero y compara, si =-1 g2<g1, =0 g2=g1, =1 g2>g1
            }
        });

        // 3. Impresión del informe final.
        System.out.println("-----------------------------------------");
        System.out.println("========= RANKING DE GOLEADORES =========");
        System.out.println("-----------------------------------------");

        for (GoleadorAux g : ranking) {
            System.out.println("Jugador: " + g.nombre);
            System.out.println("Goles: " + g.goles);
            System.out.println("Selección: " + g.seleccion.getNombreFederacion());
            System.out.println("-----------------------------------------");
        }
    }

    /**
     * Clase auxiliar para guardar los datos de cada jugador que hizo goles y poder imprimirlos.
     */
    private class GoleadorAux {
        String nombre;
        int goles;
        Seleccion seleccion;

        GoleadorAux(String nombre, int goles, Seleccion seleccion) {
            this.nombre = nombre;
            this.goles = goles;
            this.seleccion = seleccion;
        }
    }
}