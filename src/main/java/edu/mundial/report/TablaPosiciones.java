package edu.mundial.report;

import edu.mundial.domain.gestion.Grupo;
import edu.mundial.domain.organizacion.Seleccion;

import java.util.ArrayList;

public class TablaPosiciones {

    public void mostrarTabla(Grupo grupo){
        //Corroboración de que el grupo no sea nulo.
        if(grupo == null){
            return;
        }

        //Creación de arraylist y corroboración de que no sea nula ni esté vacía.
        if(grupo.getSeAgrupa() == null){
            return;
        }
        if(grupo.getSeAgrupa().isEmpty()){
            return;
        }
        ArrayList<Seleccion> selecciones = new ArrayList<>(grupo.getSeAgrupa());

        //Lambda para ordenar de mayor a menor (Hace s2, s1. No s1, s2).
        selecciones.sort(
                (s1, s2) -> Integer.compare(grupo.obtenerPuntos(s2), grupo.obtenerPuntos(s1))
        );

        int posicion = 1;

        for(Seleccion s : selecciones){
            System.out.println(posicion + "° " + s.getNombreFederacion() + " - " + grupo.obtenerPuntos(s) + " pts");
            posicion++;
        }
    }
}