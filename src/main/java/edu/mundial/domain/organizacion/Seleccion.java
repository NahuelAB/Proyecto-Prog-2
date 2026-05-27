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
    private ArrayList<Partido> partidos;

    public Seleccion() {
        this("", "", "", false, 0, null, null, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, 
        boolean cabezaGrupo, int rankingFIFA, Pais representa, Grupo incluye, ArrayList<DirectorTecnico> directoresTecnicos,
        ArrayList<CuerpoTecnico> cuerpoTecnico, ArrayList<Jugador> jugadores, ArrayList<Partido> partidos) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.representa = representa;
        this.incluye = incluye;
        this.directoresTecnicos = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.partidos = new ArrayList<>();
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

    public void setDirectoresTecnicos(ArrayList<DirectorTecnico> directoresTecnicos) {
        this.directoresTecnicos = directoresTecnicos;
    }
    public void agregarDirectoresTecnicos(DirectorTecnico directoresTecnicos) {
        this.directoresTecnicos.add(directoresTecnicos);
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
        this.cuerpoTecnico.add(cuerpoTecnico);
    }
    public void mostrarCuerpoTecnico() {
        System.out.println("Cuerpo tecnico de la seleccion: ");

        for (CuerpoTecnico i : cuerpoTecnico) {
            System.out.println(i);
        }
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void agregarJugadores(Jugador jugadores) {
        this.jugadores.add(jugadores);
    }
    public void mostrarJugadores() {
        System.out.println("Jugadores de la seleccion: ");

        for (Jugador i : jugadores) {
            System.out.println(i);
        }
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    public void agregarPartidos(Partido partidos) {
        this.partidos.add(partidos);
    }

    public void mostrarPartidos() {
        System.out.println("Partidos de la seleccion: ");

        for (Partido i : partidos) {
            System.out.println(i);
        }
    }
}
