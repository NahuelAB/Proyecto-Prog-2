package edu.mundial.domain.organizacion;
import java.util.ArrayList;
import edu.mundial.domain.persona.Arbitro;

//REPRESENTA UN PAIS PARTICIPANTE DEL MUNDIAL

public class Pais {

    //Atributos
    private String nombre;
    private String bandera;

    //Relaciones
    private Seleccion seleccion; //Asociacion: un pais es representado por una unica seleccion
    private ArrayList<Sede> sedes; //Asociacion: un pais puede tener cero o mas sedes
    private ArrayList<Arbitro> arbitros; //Asociacion: un pais puede tener cero o mas arbitros nativos
    
   
    public Pais() {
        this("", "");
    }

    public Pais(String nombre, String bandera) { //Constructor para paises sin seleccion
        this.nombre = nombre;
        this.bandera = bandera;
    }

    public Pais(String nombre, String bandera, Seleccion seleccion, ArrayList<Sede> sedes, 
        ArrayList<Arbitro> arbitros) { //Constructor para paises con seleccion
        this.nombre = nombre;
        this.bandera = bandera;
        this.seleccion = seleccion;
        this.sedes = sedes;
        this.arbitros = arbitros;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBandera() {
        return bandera;
    }
    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }
    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }


    //Se utiliza agregarSedes() para incorporar nuevos partidos en lugar de un Setter
    public void agregarSedes(Sede sede) {
        if(this.sedes == null) {
            this.sedes = new ArrayList<>();
        }

        this.sedes.add(sede);
    }
    public void mostrarSedes() {
        System.out.println("Sed(es) del pais: ");

        for(Sede i : sedes) {
            System.out.println(i);
        }
    }

    //Se utiliza agregarArbitro() para incorporar nuevos partidos en lugar de un Setter
    public void agregarArbitro(Arbitro arbitro) {
        if (this.arbitros == null) {
            this.arbitros = new ArrayList<>();
        }

        this.arbitros.add(arbitro);
    }
    public void mostrarArbitros() {
        System.out.println("Arbitro(s) del pais: ");

        for (Arbitro i : arbitros) {
            System.out.println(i);
        }
    }

}
