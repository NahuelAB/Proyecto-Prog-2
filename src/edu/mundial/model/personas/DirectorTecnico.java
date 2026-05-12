package edu.mundial.model.personas;

public class DirectorTecnico extends Persona {
    private int fechaNombramiento;

    public DirectorTecnico(){
        super();
        this.fechaNombramiento=0;
    }

    public DirectorTecnico(String nombre, int fecNacimiento, int fechaNombramiento){
        super(nombre, fecNacimiento);
        this.fechaNombramiento=fechaNombramiento;
    }

    public int getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(int fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }
}
