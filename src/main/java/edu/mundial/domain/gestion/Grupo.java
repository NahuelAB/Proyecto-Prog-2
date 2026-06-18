package edu.mundial.domain.gestion;
import edu.mundial.domain.organizacion.Seleccion;

import java.util.ArrayList;
import java.util.List;

public class Grupo{
    private String identificacion;
    private String descripcion;

    //Relaciones
    public Fase incluye;
    public List<Seleccion> seAgrupa;

    public Grupo(){
        this("","", null, null);
    }

    public Grupo(String identificacion, String descripcion, Fase incluye, List<Seleccion> seAgrupa){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.incluye = incluye;
        this.seAgrupa = seAgrupa;
    }

    //Getters y Setters
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    //PREGUNTAR SI HACE FALTA DEJAR EL GETTER Y SETTER DE INCLUYE; ES PUBLIC IGUALMENTE...
    public Fase getIncluye(){
        return incluye;
    }
    public void setIncluye(Fase incluye){
        this.incluye = incluye;
    }

    //No requiere un setter debido a que se administran las selecciones con el metodo seAgrupa.
    public List<Seleccion> getSeAgrupa(){
        return seAgrupa;
    }

    //              ---Métodos---
    //Metodo para obtener los puntos de una seleccion.
    public int obtenerPuntos(Seleccion seleccion){
        int puntos = 0;

        //Seguros en caso de listas nulas o duplicadas.
        if(seleccion == null){
            return 0;
        }
        if(this.seAgrupa == null){
            return 0;
        }
        if(!this.seAgrupa.contains(seleccion)){
            return 0;
        }
        if(this.incluye == null){
            return 0;
        }
        if(this.incluye.getCorresponde() == null){
            return 0;
        }

        for(Partido partido : this.incluye.getCorresponde()){
            List<Participacion> participaciones = partido.getParticipaciones();

            if(participaciones == null || participaciones.size() != 2){
                continue;
            }

            //Obtención de participaciones.
            Participacion p1 = participaciones.get(0);
            Participacion p2 = participaciones.get(1);

            //Corrobora que ningunas de las participaciones sean nulas.
            if(p1 == null || p2 == null){
                continue;
            }

            //Verificación de pertenencia al mismo grupo.
            if(!this.seAgrupa.contains(p1.getSeleccion()) || !this.seAgrupa.contains(p2.getSeleccion())){
                continue;
            }

            if(p1.getSeleccion().equals(seleccion)){
                if(p1.getCantidadGoles() > p2.getCantidadGoles()){
                    puntos += 3;
                }else if(p1.getCantidadGoles() == p2.getCantidadGoles()){
                    puntos += 1;
                }
            }

            if(p2.getSeleccion().equals(seleccion)){
                if(p2.getCantidadGoles() > p1.getCantidadGoles()){
                    puntos += 3;
                }else if(p2.getCantidadGoles() == p1.getCantidadGoles()){
                    puntos += 1;
                }
            }
        }

        return puntos;
    }

    //Metodo para obtener las selecicones participantes en el grupo.
    public void seAgrupa(Seleccion seleccion){
        //Seguros contra llamadas fuera del metodo y dentro del metodo (en caso de lista nula).
        if(seleccion == null){
            return;
        }
        if(this.seAgrupa == null){
            this.seAgrupa = new ArrayList<>();
        }

        //Evitar posibilidad de generar duplicados.
        if(this.seAgrupa.contains(seleccion)){
            return;
        }

        this.seAgrupa.add(seleccion);
    }
}