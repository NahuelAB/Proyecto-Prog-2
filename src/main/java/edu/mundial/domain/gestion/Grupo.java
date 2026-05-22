package edu.mundial.domain.gestion;
import edu.mundial.domain.organizacion.Seleccion;

public class Grupo{
    private String identificacion;
    private String descripcion;
    private Fase fase;

    public Grupo(){
        this.identificacion = null;
        this.descripcion = null;
    }

    public Grupo(String identificacion, String descripcion){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
    }

    // Implementación de la lógica sobre obtenerPuntos
    public int obtenerPuntos(Seleccion s){
        int puntos = 0;
        return puntos;
    }

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
}
