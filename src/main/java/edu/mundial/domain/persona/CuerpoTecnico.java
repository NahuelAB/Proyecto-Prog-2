package edu.mundial.domain.persona;
import edu.mundial.enums.Rol;
import edu.mundial.domain.organizacion.Seleccion;

public class CuerpoTecnico extends Persona {
    private Rol rol;
    private Seleccion seleccion;

    public CuerpoTecnico(){
        this("", 0, null, null);
    }
    public CuerpoTecnico(String nombre, int fecNacimiento, Rol rol,  Seleccion seleccion){
        super(nombre, fecNacimiento);
        this.rol = rol;
        this.seleccion = seleccion;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Seleccion getSeleccion() {
        return seleccion;
    }
    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
}
