package edu.mundial.domain;
import edu.mundial.enums.NombreFase;

public class Fase {
    private NombreFase nombre;

    public Fase(){
        this.nombre = null;
    }

    public Fase(NombreFase nombre){
        this.nombre = nombre;
    }

    public NombreFase getNombre(){
        return nombre;
    }

    public void setNombre(NombreFase nombre){
        this.nombre = nombre;
    }
}