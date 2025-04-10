public class Motocicleta extends Autoturism {
    private String tipMotocicleta;

    public Motocicleta(String marca, String culoare, int capacitate, String tipMotocicleta) {
        super(marca, culoare, capacitate);
        this.tipMotocicleta = tipMotocicleta;
    }

    public String getTipMotocicleta() {
        return tipMotocicleta;
    }

    public void setTipMotocicleta(String tipMotocicleta) {
        this.tipMotocicleta = tipMotocicleta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Motocicleta [tipMotocicleta=" + tipMotocicleta + "]";
    }
}