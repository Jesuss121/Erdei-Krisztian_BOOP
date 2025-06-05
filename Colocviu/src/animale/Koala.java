package animale;

import enums.TipRana;

public class Koala extends Animal {
    private int oreSomnPeZi;
    private boolean manancaEucalipt;

    public Koala(String nume, TipRana tipRana, int oreSomnPeZi, boolean manancaEucalipt) {
        super(nume, tipRana);
        this.oreSomnPeZi = oreSomnPeZi;
        this.manancaEucalipt = manancaEucalipt;
    }

    public int getOreSomnPeZi() {
        return oreSomnPeZi;
    }

    public boolean isManancaEucalipt() {
        return manancaEucalipt;
    }

    @Override
    public String getSpecie() {
        return "koala";
    }

}