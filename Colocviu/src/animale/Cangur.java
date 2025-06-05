package animale;
import enums.TipRana;

public class Cangur extends Animal {
    private double lungimeSaritura;
    private boolean arePungaMarsupiala;

    public Cangur(String nume, TipRana tipRana, double lungimeSaritura, boolean arePungaMarsupiala) {
        super(nume, tipRana);
        this.lungimeSaritura = lungimeSaritura;
        this.arePungaMarsupiala = arePungaMarsupiala;
    }

    public double getLungimeSaritura() {
        return lungimeSaritura;
    }

    public boolean isArePungaMarsupiala() {
        return arePungaMarsupiala;
    }

    @Override
    public String getSpecie() {
        return "cangur";
    }

}

