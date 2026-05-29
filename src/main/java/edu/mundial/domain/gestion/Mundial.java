package edu.mundial.domain.gestion;

import edu.mundial.domain.organizacion.Sede;

import java.util.ArrayList;
import java.util.List;

public class Mundial {
    private int anio;
    private String mascota;
    private int fechaDesde;
    private int fechaHasta;

    // Relaciones
    private List<Sede> sedes;

    public Mundial(){
        this(0, null, 0, 0, null);
    }

    public Mundial(int anio, String mascota, int fechaDesde, int fechaHasta, List<Sede> sedes){
        this.anio = anio;
        this.mascota = mascota;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.sedes = sedes;
    }

    //Getters y Setters
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    public String getMascota(){
        return mascota;
    }
    public void setMascota(String mascota){
        this.mascota = mascota;
    }

    public int getFechaDesde(){
        return fechaDesde;
    }
    public void setFechaDesde(int fechaDesde){
        this.fechaDesde = fechaDesde;
    }

    public int getFechaHasta(){
        return fechaHasta;
    }
    public void setFechaHasta(int fechaHasta){
        this.fechaHasta = fechaHasta;
    }

    public List<Sede> getSedes(){
        return sedes;
    }
    public void setSedes(List<Sede> sedes){
        this.sedes = sedes;
    }

    //              ---Métodos---

    //Metodo para agregar sedes a su lista.
    public void addSede(Sede sede){
        //Seguros contra llamadas fuera del metodo y dentro del metodo (en caso de lista nula).
        if(sede == null){
            return;
        }
        if(this.sedes == null) {
            this.sedes = new ArrayList<>();
        }

        //Seguro contra duplicados.
        if(this.sedes.contains(sede)){
            return;
        }

        this.sedes.add(sede);
        sede.setMundial(this);
    }
}