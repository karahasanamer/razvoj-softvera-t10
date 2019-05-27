package ba.unsa.rs.tutorijal10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Tutorijal {

    public static ArrayList<Grad>ucitajGradove() {
        ArrayList<Grad> grad = new ArrayList<>();
        try {
            FileReader fajl = new FileReader("mjerenja.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        return grad;
    }

    public static void main(String[] args) {

    }

}
