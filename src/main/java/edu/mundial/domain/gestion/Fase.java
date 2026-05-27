package edu.mundial.domain.gestion;
import edu.mundial.enums.NombreFase;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private NombreFase nombre;

    // Relación con Partido
    private List<Partido> corresponde;

    //Relacion con Grupo
    private List<Grupo> grupo;
    public Fase(){
        this(null);
    }
    
    public Fase(NombreFase nombre){
        this.nombre = nombre;
        this.corresponde = new ArrayList<Partido>();
        this.grupo = new ArrayList<Grupo>();
    }

    public NombreFase getNombre(){
        return nombre;
    }
    public void setNombre(NombreFase nombre){
        this.nombre = nombre;
    }

    public void addPartido(Partido partido){
        this.corresponde.add(partido);
    }
    public List<Partido> getCorresponde(){
        return corresponde;
    }
    public void setCorresponde(List<Partido> corresponde){
        this.corresponde = corresponde;
    }

    public void addGrupo(Grupo grupo){
        this.grupo.add(grupo);
    }
    public List<Grupo> getGrupo(){
        return grupo;
    }
    public void setGrupo(List<Grupo> grupo){
        this.grupo = grupo;
    }
}