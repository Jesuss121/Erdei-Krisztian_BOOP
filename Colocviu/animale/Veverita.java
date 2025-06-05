package animale;

import enums.TipRana;

public class Veverita extends Animal {
    private boolean areCoadaStufoasa;

    public Veverita(String nume, TipRana tipRana, boolean areCoadaStufoasa) {
        super(nume, tipRana);
        this.areCoadaStufoasa = areCoadaStufoasa;
    }

    public boolean isAreCoadaStufoasa() {
        return areCoadaStufoasa;
    }

    @Override
    public String getSpecie() {
        return "veverita";
    }
}
