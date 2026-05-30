package edu.mundial.domain.organizacion;
import edu.mundial.domain.gestion.Mundial;
import java.util.ArrayList;

//REPRESENTA UNA SEDE DONDE SE DISPUTARA EL MUNDIAL
public class Sede {

    //Atributos
    private String ciudad;
    private float alturaNivelMar;
    private String clima;
    private String zonaHoraria;

    //Relaciones
    private Pais pais; //Asociacion: una sede esta ubicada en un unico pais
    private Mundial mundial; //Asociacion: una sede pertenece a un unico mundial
    private ArrayList<Estadio> estadios; //Asociacion: una sede tiene 1 o mas estadios


    public Sede() {
        this("", 0, "", "", null, null, new ArrayList<>());
    }

    public Sede(String ciudad, float alturaNivelMar, String clima, String zonaHoraria, 
        Pais pais, Mundial mundial, ArrayList<Estadio> estadios) {
        this.ciudad = ciudad;
        this.alturaNivelMar = alturaNivelMar;
        this.clima = clima;
        this.zonaHoraria = zonaHoraria;
        this.pais = pais;
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

    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Mundial getMundial() {
        return mundial;
    }
    public void setMundial(Mundial mundial) {
        this.mundial = mundial;
    }

    //Se utiliza agregarPartido() para incorporar nuevos partidos en lugar de un Setter
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
