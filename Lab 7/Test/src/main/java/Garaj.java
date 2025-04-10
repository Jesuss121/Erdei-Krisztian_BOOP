import java.util.*;

public class Garaj {
    private List<Vehicul> vehicule;

    public Garaj() {
        vehicule = new ArrayList<>();
    }

    public void adaugaVehicul(Vehicul vehicul) {
        vehicule.add(vehicul);
    }

    public void afiseazaVehicule() {
        for (Vehicul v : vehicule) {
            System.out.println(v.toString());
        }
    }

    public void afiseazaMotocicleteDeTip(String tip) {
        for (Vehicul v : vehicule) {
            if (v instanceof Motocicleta m && m.getTipMotocicleta().equalsIgnoreCase(tip)) {
                System.out.println(m);
            }
        }
    }

    public void afiseazaMasiniCu2Usi() {
        for (Vehicul v : vehicule) {
            if (v instanceof Masina m && m.getNumarUsi() == 2) {
                System.out.println(m);
            }
        }
    }
}
