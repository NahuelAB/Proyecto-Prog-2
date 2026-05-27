package edu.mundial.domain.organizacion;
import edu.mundial.domain.gestion.Partido;
import java.util.ArrayList;

public class Estadio {
    private String nombre;
    private int capacidad;
    public Sede tiene;
    private ArrayList<Partido> partidos;

    public Estadio() {
        this("", 0, null, new ArrayList<>());

    }

    public Estadio(String nombre, int capacidad, Sede tiene, ArrayList<Partido> partidos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tiene = tiene;
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Sede getTiene() {
        return tiene;
    }
    public void setTiene(Sede tiene) {
        this.tiene = tiene;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    public void agregarPartido(Partido partidos) {
        if(this.partidos == null) {
            this.partidos = new ArrayList<>();
        }

        this.partidos.add(partidos);
    }
    public void mostrarPartidos() {
        System.out.println("Partidos en el estadio: ");

        for(Partido i : partidos) {
            System.out.println(i);
        }
    }
}
