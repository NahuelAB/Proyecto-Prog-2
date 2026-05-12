package edu.mundial.model.organizacion;

public class Seleccion {
    private String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private int rankingFIFA;

    public Seleccion() {
        this.nombreFederacion = null;
        this.camisetaPrincipal = null;
        this.camisetaSecundaria = null;
        this.cabezaGrupo = false;
        this.rankingFIFA = 0;
    }

    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo, int rankingFIFA) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaPrincipal;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
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

    public boolean getCabezaGrupo() {
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
}
