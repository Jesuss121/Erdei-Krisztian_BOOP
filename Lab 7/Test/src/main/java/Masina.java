public class Masina extends Autoturism {
    private int numarUsi;
    private String tipCombustibil;

    public Masina(String marca, String culoare, int capacitate, int numarUsi, String tipCombustibil) {
        super(marca, culoare, capacitate);
        this.numarUsi = numarUsi;
        this.tipCombustibil = tipCombustibil;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public String getTipCombustibil() {
        return tipCombustibil;
    }

    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }

    @Override
    public String toString() {
        return super.toString() + ", Masina [numarUsi=" + numarUsi + ", tipCombustibil=" + tipCombustibil + "]";
    }
}
