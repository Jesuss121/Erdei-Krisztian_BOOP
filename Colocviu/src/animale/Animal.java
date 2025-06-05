package animale;


import enums.TipRana;

import java.time.LocalDateTime;

public abstract class Animal {
    private String nume;
    private TipRana tipRana;
    private LocalDateTime dataCazare;

    public Animal(String nume, TipRana tipRana) {
        this.nume = nume;
        this.tipRana = tipRana;
    }

    public String getNume() {
        return nume;
    }

    public TipRana getTipRana() {
        return tipRana;
    }

    public LocalDateTime getDataCazare() {
        return dataCazare;
    }

    public void setDataCazare(LocalDateTime dataCazare) {
        this.dataCazare = dataCazare;
    }

    public abstract String getSpecie();

}
