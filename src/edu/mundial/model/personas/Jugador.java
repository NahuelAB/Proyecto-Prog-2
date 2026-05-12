package edu.mundial.model.personas;
import edu.mundial.enums.Posicion;
import edu.mundial.model.organizacion.Seleccion;

public class Jugador extends Persona {
    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;
    public Seleccion integra;

    public Jugador(){
        super();
        this.dorsal=0;
        this.posicion=null;
        this.peso=0;
        this.altura=0;
        this.integra=null;
    }

    public Jugador(String nombre, int fecNacimiento, int dorsal, Posicion posicion, float peso, float altura, Seleccion integra){
        super(nombre, fecNacimiento);
        this.dorsal=dorsal;
        this.posicion=posicion;
        this.peso=peso;
        this.altura=altura;
        this.integra=integra;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public Seleccion getIntegra() {
        return integra;
    }
    public void setIntegra(Seleccion integra) {
        this.integra = integra;
    }
}
