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
    /*public int obtenerPuntos(Seleccion s){
        //NO TIENE LÓGICA REAL, POR EL MOMENTO SE LO DEJA DE ÉSTA FORMA HASTA TENER DESARROLLADO EL CÓDIGO.
        int puntos = 0;
        return puntos;
    }
     */

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