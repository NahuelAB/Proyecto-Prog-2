package edu.mundial.domain.organizacion;
import edu.mundial.domain.persona.*;
import edu.mundial.domain.gestion.*;
import java.util.ArrayList;

public class Seleccion {
    private String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private int rankingFIFA;
    public Pais representa;
    private Grupo incluye;
    private ArrayList<DirectorTecnico> directoresTecnicos;
    private ArrayList<CuerpoTecnico> cuerpoTecnico;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Participacion> participaciones;
    public Object mostrarDirectoresTecnicos;

    public Seleccion() {
        this("", "", "", false, 0, null, null, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, 
        boolean cabezaGrupo, int rankingFIFA, Pais representa, Grupo incluye, ArrayList<DirectorTecnico> directoresTecnicos,
        ArrayList<CuerpoTecnico> cuerpoTecnico, ArrayList<Jugador> jugadores, ArrayList<Participacion> participaciones) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.representa = representa;
        this.incluye = incluye;
        this.directoresTecnicos = directoresTecnicos;
        this.cuerpoTecnico = cuerpoTecnico;
        this.jugadores = jugadores;
        this.participaciones = participaciones;
    }

    public String getNombreFederacion() {
        return nombreFederacion;
    }
    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    public String getCamisetaPrincipal() {
        return camisetaPrincipal;
    }
    public void setCamisetaPrincipal(String camisetaPrincipal) {
        this.camisetaPrincipal = camisetaPrincipal;
    }

    public String getCamisetaSecundaria() {
        return camisetaSecundaria;
    }
    public void setCamisetaSecundaria(String camisetaSecundaria) {
        this.camisetaSecundaria = camisetaSecundaria;
    }

    public boolean isCabezaGrupo() {
        return cabezaGrupo;
    }
    public void setCabezaGrupo(boolean cabezaGrupo) {
        this.cabezaGrupo = cabezaGrupo;
    }

    public int getRankingFIFA() {
        return rankingFIFA;
    }
    public void setRankingFIFA(int rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }

    public Pais getRepresenta() {
        return representa;
    }
    public void setRepresenta(Pais representa) {
        this.representa = representa;
    }

    public Grupo getIncluye() {
        return incluye;
    }
    public void setIncluye(Grupo incluye) {
        this.incluye = incluye;
    }

    public ArrayList<DirectorTecnico> getDirectoresTecnicos() {
        return directoresTecnicos;
    }
    public void setDirectoresTecnicos(ArrayList<DirectorTecnico> directoresTecnicos) {
        this.directoresTecnicos = directoresTecnicos;
    }
    public void agregarDirectorTecnico(DirectorTecnico directorTecnico) {
        if (this.directoresTecnicos == null) {
            this.directoresTecnicos = new ArrayList<>();
        }
        this.directoresTecnicos.add(directorTecnico);
    }
    public void mostrarDirectoresTecnicos() {
        System.out.println("Director(es) tecnico(s) de la seleccion: ");

        for(DirectorTecnico i : directoresTecnicos) {
            System.out.println(i);
        }
    }

    public void setCuerpoTecnico(ArrayList<CuerpoTecnico> cuerpoTecnico) {
        this.cuerpoTecnico = cuerpoTecnico;
    }
    public void agregarCuerpoTecnico(CuerpoTecnico cuerpoTecnico) {
        if (this.cuerpoTecnico == null) {
            this.cuerpoTecnico = new ArrayList<>();
        }

        this.cuerpoTecnico.add(cuerpoTecnico);
    }
    public void mostrarCuerpoTecnico() {
        System.out.println("Cuerpo tecnico de la seleccion: ");

        for (CuerpoTecnico i : cuerpoTecnico) {
            System.out.println(i);
        }
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void agregarJugador(Jugador jugador) {
        if (this.jugadores == null) {
            this.jugadores = new ArrayList<>();
        }

        this.jugadores.add(jugador);
    }
    public void mostrarJugadores() {
        System.out.println("Jugadores de la seleccion: ");

        for (Jugador i : jugadores) {
            System.out.println(i);
        }
    }

    public void setParticipaciones(ArrayList<Participacion> participaciones) {
        this.participaciones = participaciones;
    }
    public void agregarParticipacion(Participacion participacion) {
        if (this.participaciones == null) {
            this.participaciones = new ArrayList<>();
        }

        this.participaciones.add(participacion);
    }
    public void mostrarParticipaciones() {
        System.out.println("Participaciones de la seleccion: ");

        for (Participacion i : participaciones) {
            System.out.println(i);
        }
    }

}
