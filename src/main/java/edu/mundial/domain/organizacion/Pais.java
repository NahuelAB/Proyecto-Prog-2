package edu.mundial.domain.organizacion;
import java.util.ArrayList;
import edu.mundial.domain.persona.Arbitro;

public class Pais {
    private String nombre;
    private String bandera;
    public Seleccion representa;
    private ArrayList<Sede> sedes;
    private ArrayList<Arbitro> arbitros;
    
   
    public Pais() {
        this("", "");
    }

    public Pais(String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
    }

    public Pais(String nombre, String bandera, Seleccion representa, ArrayList<Sede> sedes, ArrayList<Arbitro> arbitros) {
        this.nombre = nombre;
        this.bandera = bandera;
        this.representa = representa;
        this.sedes = new ArrayList<>();
        this.arbitros = new ArrayList<>();
    }

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

    public Seleccion getRepresenta() {
        return representa;
    }
    public void setRepresenta(Seleccion representa) {
        this.representa = representa;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }
    public void agregarSedes(Sede sedes) {
        this.sedes.add(sedes);
    }
    public void mostrarSedes() {
        System.out.println("Sed(es) del pais: ");

        for(Sede i : sedes) {
            System.out.println(i);
        }
    }

    public void setArbitros(ArrayList<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }
    public void agregarArbitros(Arbitro arbitros) {
        this.arbitros.add(arbitros);
    }
    public void mostrarArbitros() {
        System.out.println("Arbitro(s) del pais: ");

        for (Arbitro i : arbitros) {
            System.out.println(i);
        }
    }

}
