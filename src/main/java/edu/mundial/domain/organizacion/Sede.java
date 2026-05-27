package edu.mundial.domain.organizacion;
import edu.mundial.domain.gestion.Mundial;
import java.util.ArrayList;

public class Sede {
    private String ciudad;
    private float alturaNivelMar;
    private String clima;
    private String zonaHoraria;
    public Pais pertenece;
    public Mundial mundial;
    private ArrayList<Estadio> estadios;


    public Sede() {
        this("", 0, "", "", null, null, new ArrayList<>());
    }

    public Sede(String ciudad, float alturaNivelMar, String clima, String zonaHoraria, Pais pertenece, Mundial mundial, ArrayList<Estadio> estadios) {
        this.ciudad = ciudad;
        this.alturaNivelMar = alturaNivelMar;
        this.clima = clima;
        this.zonaHoraria = zonaHoraria;
        this.pertenece = pertenece;
        this.mundial = mundial;
        this.estadios = estadios;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getAlturaNivelMar() {
        return alturaNivelMar;
    }
    public void setAlturaNivelMar(float alturaNivelMar) {
        this.alturaNivelMar = alturaNivelMar;
    } 

    public String getClima() {
        return clima;
    }
    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }
    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public Pais getPertenece() {
        return pertenece;
    }
    public void setPertenece(Pais pertenece) {
        this.pertenece = pertenece;
    }

    public Mundial getMundial() {
        return mundial;
    }
    public void setMundial(Mundial mundial) {
        this.mundial = mundial;
    }

    public void setEstadios(ArrayList<Estadio> estadios) {
        this.estadios = estadios;
    }
    public void agregarEstadio(Estadio estadio) {
        if(this.estadios == null) {
            this.estadios = new ArrayList<>();
        }
        this.estadios.add(estadio);
    }
    public void mostrarEstadios() {
        System.out.println("Estadios de la sede: ");

        for(Estadio i : estadios) {
            System.out.println(i);
        }
    }
}
