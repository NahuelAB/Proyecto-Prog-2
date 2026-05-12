package edu.mundial.model.organizacion;

public class Sede {
    private String ciudad;
    private float alturaNivelMar;
    private String clima;
    private String zonaHoraria;
    public Pais pertenece;

    public Sede() {
        this.ciudad = null;
        this.alturaNivelMar = 0;
        this.clima = null;
        this.zonaHoraria = null;
        this.pertenece = null;
    }

    public Sede(String ciudad, float alturaNivelMar, String clima, String zonaHoraria, Pais pertenece) {
        this.ciudad = ciudad;
        this.alturaNivelMar = alturaNivelMar;
        this.clima = clima;
        this.zonaHoraria = zonaHoraria;
        this.pertenece = pertenece;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getAlturaNivelMar() {
        return alturaNivelMar;
    }
    public void setAlturaNivelMar(float alturaNivelMar) {
        this.alturaNivelMar = alturaNivelMar;
    } 

    public String getClima() {
        return clima;
    }
    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }
    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public Pais getPertenece() {
        return pertenece;
    }
    public void setPertenece(Pais pertenece) {
        this.pertenece = pertenece;
    }
}
