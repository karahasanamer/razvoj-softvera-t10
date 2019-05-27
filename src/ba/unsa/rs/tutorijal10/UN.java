package ba.unsa.rs.tutorijal10;

import java.io.Serializable;
import java.util.ArrayList;

public class UN implements Serializable {

    public UN() {
    }

    public ArrayList<Drzava> getDrzava() {
        return drzava;
    }

    public void setDrzava(ArrayList<Drzava> drzava) {
        this.drzava = drzava;
    }

    ArrayList<Drzava> drzava = new ArrayList<>();

}
