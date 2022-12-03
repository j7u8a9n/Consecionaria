package com.j7u8a9n.model;

public class Revision {
    //PK
    private String codigo;
    private String filtro;
    private String frenos;
    private String aceite;
    //FK
    private Coche coche;
    public Revision(){

    }

    public Revision(String codigo, String filtro, String aceite, String frenos , Coche coche) {
        this.codigo = codigo;
        this.filtro = filtro;
        this.frenos = frenos;
        this.aceite = aceite;
        this.coche = coche;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "codigo='" + codigo + '\'' +
                ", filtro='" + filtro + '\'' +
                ", frenos='" + frenos + '\'' +
                ", aceite='" + aceite + '\'' +
                ", coche=" + coche +
                '}';
    }
}



