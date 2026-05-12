package edu.mundial.model.personas;
import edu.mundial.model.organizacion.Seleccion;

public class DirectorTecnico extends Persona {
    private int fechaNombramiento;
    public Seleccion dirige;

    public DirectorTecnico(){
        super();
        this.fechaNombramiento=0;
        this.dirige = null;
    }

    public DirectorTecnico(String nombre, int fecNacimiento, int fechaNombramiento, Seleccion dirige){
        super(nombre, fecNacimiento);
        this.fechaNombramiento = fechaNombramiento;
        this.dirige = dirige;
    }

    public int getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(int fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public Seleccion getDirige() {
        return dirige;
    }

    public void setDirige(Seleccion dirige) {
        this.dirige = dirige;
    }
}
