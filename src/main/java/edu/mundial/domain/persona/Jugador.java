package edu.mundial.domain.persona;
import edu.mundial.enums.Posicion;
import edu.mundial.domain.organizacion.Seleccion;
import edu.mundial.domain.gestion.Evento;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un deportista inscripto en el mundial.
 * Mantiene información sobre su físico, posición en el campo y la selección que integra.
 */
public class Jugador extends Persona {
    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;
    private Seleccion integra;
    private List<Evento> eventos;

    /**
     * Constructor por defecto.
     */
    public Jugador(){
        this("", 0, 0, null, 0, 0, null);
     }

    /**
     * Constructor completo para registrar un jugador.
     * @param nombre Nombre del jugador heredado de Persona.
     * @param fecNacimiento Año de nacimiento heredado de Persona.
     * @param dorsal Número de camiseta asignado.
     * @param posicion Puesto en el que juega (Arquero, Defensor, etc.).
     * @param peso Peso en kilogramos.
     * @param altura Altura en metros.
     * @param integra Selección nacional a la que representa.
     * @param
     */
    public Jugador(String nombre, int fecNacimiento, int dorsal, Posicion posicion, float peso, float altura, Seleccion integra) {
        super(nombre, fecNacimiento);
        this.dorsal=dorsal;
        this.posicion=posicion;
        this.peso=peso;
        this.altura=altura;
        this.integra=integra;
        this.eventos= new ArrayList<>();
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

    public List<Evento> getEventos() {
        return eventos;
    }

    public void addEventos(Evento evento) {
        if (this.eventos == null){
            this.eventos = new ArrayList<>();
        }
        this.eventos.add(evento);
    }
}
