package edu.mundial.domain.gestion;

import edu.mundial.enums.CategoriaArbitro;
import edu.mundial.domain.persona.Arbitro;

public class Arbitraje {
    private CategoriaArbitro categoria;
    private Arbitro arbitro;
    private Partido partido;

    public Arbitraje(){
        this.categoria = null;
        this.arbitro = null;
        this.partido = null;
    }

    public Arbitraje(CategoriaArbitro categoria,  Arbitro arbitro, Partido partido){
        this.categoria=categoria;
        this.arbitro=arbitro;
        this.partido=partido;
    }

    public CategoriaArbitro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArbitro categoria) {
        this.categoria = categoria;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
