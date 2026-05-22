package edu.mundial.domain.persona;
import edu.mundial.domain.organizacion.Pais;

/**
 * Representa la autoridad encargada de dirigir una competición y aplicar el reglamento oficial.
 * Contiene la informacion sobre sus años de experiencia y su nacionalidad.
 */
public class Arbitro extends Persona {
    private int aniosExperiencia;
    public Pais cuentaCon;

    /**
     * Constructor por defecto.
     */
    public Arbitro(){
        this("", 0, 0, null);
    }

    /**
     * Constructor para registrar un árbitro.
     * @param nombre Nombre del árbitro.
     * @param fecNacimiento Año de nacimiento.
     * @param aniosExperiencia Cantidad de años arbitrando profesionalmente.
     * @param cuentaCon País al que pertenece el árbitro.
     */
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
