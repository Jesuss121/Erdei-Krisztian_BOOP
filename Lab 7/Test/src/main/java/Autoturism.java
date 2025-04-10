public class Autoturism implements Vehicul {
    private String marca;
    private int viteza;
    private String culoare;
    private int capacitate;

    public Autoturism(String marca, String culoare, int capacitate) {
        this.marca = marca;
        this.culoare = culoare;
        this.capacitate = capacitate;
        this.viteza = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public void porneste() {
        System.out.println(marca + " a pornit.");
    }

    public void opreste() {
        System.out.println(marca + " s-a oprit.");
    }

    @Override
    public void accelereaza(int x) {
        viteza += x;
    }

    @Override
    public void decelereaza(int x) {
        viteza = Math.max(0, viteza - x);
    }

    @Override
    public String toString() {
        return "Autoturism [marca=" + marca + ", viteza=" + viteza + ", culoare=" + culoare + ", capacitate=" + capacitate + "]";
    }
}