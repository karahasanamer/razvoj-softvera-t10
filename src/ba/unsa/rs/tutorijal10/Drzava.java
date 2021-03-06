package ba.unsa.rs.tutorijal10;

import java.io.Serializable;

public class Drzava implements Serializable
{

    String naziv;
    int brojStanovnika;
    double povrsina;
    Grad glavniGrad;

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public void setGlavniGrad(Grad glavniGrad) {
        this.glavniGrad = glavniGrad;
    }

    public Drzava() {
    }


    public Drzava(String naziv, int brojStanovnika, double povrsina, Grad glavniGrad, String jedinicaZaPovrsinu) {
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.povrsina = povrsina;
        this.glavniGrad = glavniGrad;
        this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public String getJedinicaZaPovrsinu() {
        return jedinicaZaPovrsinu;
    }

    public void setJedinicaZaPovrsinu(String jedinicaZaPovrsinu) {
        this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
    }

    String jedinicaZaPovrsinu;


}
