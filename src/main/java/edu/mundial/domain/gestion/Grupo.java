package edu.mundial.domain.gestion;
import edu.mundial.domain.organizacion.Seleccion;

public class Grupo{
    private String identificacion;
    private String descripcion;

    // Relación con Fase
    private Fase fase;

    public Grupo(){
        this("","", null);
    }

    public Grupo(String identificacion, String descripcion, Fase fase){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.fase = fase;
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

    public Fase getFase(){
        return fase;
    }
    public void setFase(Fase fase){
        this.fase = fase;
    }
}