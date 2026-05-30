package edu.mundial.domain.organizacion;
import edu.mundial.domain.gestion.Partido;
import java.util.ArrayList;
 
//REPRESENTA UN ESTADIO DONDE SE JUGARAN PARTIDOS DEL MUNDIAL

public class Estadio {

    //Atributos
    private String nombre;
    private int capacidad;

    //Relaciones
    private Sede sede; //Asociacion: un estadio pertenece a una unica sede
    private ArrayList<Partido> partidos; //Asociacion: un estadio puede tener multiples partidos

    public Estadio() {
        this("", 0, null, null);
    }

    public Estadio(String nombre, int capacidad, Sede sede, ArrayList<Partido> partidos) { 
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sede = sede;
        this.partidos = partidos;
    }

    //Getters y Setters
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

    public Sede getSede() {
        return sede;
    }
    public void setSede(Sede sede) {
        this.sede = sede;
    }

    //Se utiliza agregarPartido() para incorporar nuevos partidos en lugar de un Setter
    public void agregarPartido(Partido partido) {
        if(this.partidos == null) { //Inicializa la lista si aun no fue creada
            this.partidos = new ArrayList<>();
        }

        this.partidos.add(partido);
    }
    public void mostrarPartidos() {
        System.out.println("Partidos en el estadio:\n---------------------------");
        for(Partido i : partidos) {
            System.out.println(i + "\n---------------------------");
        }
    }
}
