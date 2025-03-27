/*
Ex 1
import java.awt.Color;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private int viteza;
    private int treapta;
    private int vitezaMax;

    public Autovehicul() {
        marca = "Necunoscuta";
        culoare = Color.GRAY;
        viteza = 0;
        treapta = 0;
        vitezaMax = 180;
    }

    public Autovehicul(String m, Color c, int vmax) {
        marca = m;
        culoare = c;
        vitezaMax = vmax;
        viteza = 0;
        treapta = 0;
    }

    public void accelereaza(int km) {
        viteza += km;
        if (viteza > vitezaMax) viteza = vitezaMax;
    }

    public void decelereaza(int km) {
        viteza -= km;
        if (viteza < 0) viteza = 0;
    }

    public void schimbaTreapta(int t) {
        treapta = t;
    }

    public void opreste() {
        viteza = 0;
        treapta = 0;
    }

    public String getMarca() { return marca; }
    public int getViteza() { return viteza; }
    public int getTreapta() { return treapta; }
}
Ex 2
public class Sofer {
    String nume;
    int varsta;

    public Sofer(String n, int v) {
        nume = n;
        varsta = v;
    }

    public String getNume() {
        return nume;
    }
}

Ex 3
import java.awt.Color;

public class TestAutovehicul {
    public static void main(String[] args) {
        Autovehicul a = new Autovehicul("Dacia", Color.BLUE, 160);

        a.schimbaTreapta(1);
        a.accelereaza(30);
        a.schimbaTreapta(2);
        a.accelereaza(20);
        a.decelereaza(15);
        a.opreste();

        System.out.println("Marca: " + a.getMarca());
        System.out.println("Viteza: " + a.getViteza());
        System.out.println("Treapta: " + a.getTreapta());
    }
}
*/