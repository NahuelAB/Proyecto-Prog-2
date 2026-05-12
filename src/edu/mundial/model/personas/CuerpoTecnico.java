package edu.mundial.model.personas;
import edu.mundial.enums.Rol;

public class CuerpoTecnico extends Persona {
    private Rol rol;

    public CuerpoTecnico(){
        super();
        this.rol = null;
    }
    public CuerpoTecnico(String nombre, int fecNacimiento, Rol rol){
        super(nombre, fecNacimiento);
        this.rol = rol;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
