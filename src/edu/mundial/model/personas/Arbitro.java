package edu.mundial.model.personas;
import edu.mundial.model.organizacion.Pais;

public class Arbitro extends Persona {
    private int aniosExperiencia;
    public Pais cuentaCon;


    public Arbitro(){
        super();
        this.aniosExperiencia = 0;
        this.cuentaCon = null;
    }

    public Arbitro(String nombre, int fecNacimiento, int aniosExperiencia, Pais cuentaCon){
        super(nombre, fecNacimiento);
        this.aniosExperiencia = aniosExperiencia;
        this.cuentaCon = cuentaCon;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public Pais getNacionalidad() {
        return cuentaCon;
    }
    public void setNacionalidad(Pais pais) {
        this.cuentaCon = pais;
    }
}
