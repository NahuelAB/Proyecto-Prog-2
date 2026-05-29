package edu.mundial.domain.gestion;
import edu.mundial.enums.NombreFase;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private NombreFase nombre;

    //Relaciones
    public List<Partido> corresponde;
    public List<Grupo> incluye;

    public Fase() {
        this(null, null, null);
    }

    public Fase(NombreFase nombre, List<Partido> corresponde, List<Grupo> incluye) {
        this.nombre = nombre;
        this.corresponde = corresponde;
        this.incluye = incluye;
    }

    //Getters y Setters
    public NombreFase getNombre() {
        return nombre;
    }

    public void setNombre(NombreFase nombre) {
        this.nombre = nombre;
    }

    //PREGUNTAR SI HACE FALTA DEJAR EL GETTER Y SETTER DE CORRESPONDE E INCLUYE; ES PUBLIC IGUALMENTE EN AMBOS CASOS...
    public List<Partido> getCorresponde() {
        return corresponde;
    }

    public void setCorresponde(List<Partido> corresponde) {
        this.corresponde = corresponde;
    }

    public List<Grupo> getIncluye() {
        return incluye;
    }

    public void setIncluye(List<Grupo> incluye) {
        this.incluye = incluye;
    }

    //              ---Métodos---

    //Metodo para agregar partidos a la lista de fases.
    public void addPartido(Partido partido) {
        //Seguros contra llamadas fuera del metodo y dentro del metodo (en caso de lista nula).
        if(partido == null){
            return;
        }
        if(this.corresponde == null){
            this.corresponde = new ArrayList<>();
        }

        if(!this.corresponde.contains(partido)){
            this.corresponde.add(partido);
            partido.setCorresponde(this);
        }
    }

    //Metodo para agregar grupos a la lista de fases.
    public void addGrupo(Grupo grupo) {
        //Seguros contra llamadas fuera del metodo y dentro del metodo (en caso de lista nula).
        if(grupo == null){
            return;
        }
        if(this.incluye == null){
            this.incluye = new ArrayList<>();
        }

        if (!this.incluye.contains(grupo)) {
            this.incluye.add(grupo);
            grupo.setIncluye(this);
        }
    }
    //Ámbos funcionan para corroborar que tanto los grupos como los partidos están actualizados y se los agrega en el mismo momento de la llamada al metodo.
}