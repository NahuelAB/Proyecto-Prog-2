package edu.mundial.report;

import java.util.ArrayList;
import edu.mundial.domain.gestion.Partido;
import edu.mundial.domain.gestion.Participacion;
import edu.mundial.domain.gestion.Evento;
import edu.mundial.domain.persona.Jugador;
import edu.mundial.domain.organizacion.Seleccion;

public class FichaTecnicaPartido {
    public void generarFichaTecnica(Partido partido) {
        if (partido == null) {
            System.out.println("Error: El partido no existe.");
            return;
        }

        //Obtener las participaciones de las dos selecciones
        if (partido.getParticipaciones() == null || partido.getParticipaciones().size() < 2) {
            System.out.println("Error: El partido no cuenta con las dos participaciones registradas.");
            return;
        }

        //Clasifica las dos participaciones de un partido segun local y visitante
        Participacion local = null;
        Participacion visitante = null;
        Participacion primera = partido.getParticipaciones().get(0);
        Participacion segunda = partido.getParticipaciones().get(1);

        if (primera.isEsLocal()) {
            local = primera;
            visitante = segunda;
        } else {
            local = segunda;
            visitante = primera;
        }
        if (local == null || visitante == null) {
            System.out.println("Error: Estructura de local/visitante inválida.");
            return;
        }

        Seleccion selLocal = local.getSeleccion();
        Seleccion selVisitante = visitante.getSeleccion();

        System.out.println("\n=================================================="
                + "\n            FICHA TÉCNICA DEL PARTIDO             "
                + "\nFecha: " + partido.getFecha() 
                + "\nHora: " + partido.getHorario()
                + "\nDuración: " + partido.getDuracion() 
                + " min (+ " + partido.getTiempoAdicional() + " min adicionales)"

                + "\n--------------------------------------------------"
                + "\n                 RESULTADO FINAL                  "
                + selLocal.getNombreFederacion() + " " + local.getCantidadGoles() 
                + " - " + visitante.getCantidadGoles() + " " + selVisitante.getNombreFederacion()

                + "\n--------------------------------------------------"
                + "\n                   ALINEACIONES                   \n");
        //Se crea ArrayList para no repetir codigo
        ArrayList<Seleccion> sel = new ArrayList<>();
        sel.add(selLocal);
        sel.add(selVisitante);
        for (int i = 0; i < sel.size(); i++) {
            System.out.println(sel.get(i).getNombreFederacion()
                + "\nDT: " + sel.get(i).getDirectoresTecnicos()
                + "\nJugadores:");
            for (Jugador j : sel.get(i).getJugadores()) {
                System.out.println(j.getPosicion() + " " + j.getNombre());
            }
        }


        System.out.println("=================================================================\n");
    }


}
