public class TestGaraj {
    public static void main(String[] args) {
        Garaj garaj = new Garaj();

        Masina masina1 = new Masina("Dacia", "Alb", 5, 4, "Benzina");
        Masina masina2 = new Masina("Mazda", "Rosu", 5, 2, "Diesel");
        Motocicleta moto1 = new Motocicleta("Yamaha", "Negru", 2, "Sport");
        Motocicleta moto2 = new Motocicleta("Honda", "Albastru", 2, "Cruiser");

        garaj.adaugaVehicul(masina1);
        garaj.adaugaVehicul(masina2);
        garaj.adaugaVehicul(moto1);
        garaj.adaugaVehicul(moto2);

        System.out.println("--- Vehicule in garaj ---");
        garaj.afiseazaVehicule();

        System.out.println("--- Pornire si oprire vehicule ---");
        masina1.porneste();
        masina2.porneste();
        moto1.porneste();
        moto2.porneste();
        masina1.opreste();
        masina2.opreste();
        moto1.opreste();
        moto2.opreste();

        System.out.println("--- Viteza curenta ---");
        masina1.accelereaza(50);
        masina2.accelereaza(60);
        moto1.accelereaza(70);
        moto2.accelereaza(80);

        System.out.println(masina1.getMarca() + " viteza: " + masina1.getViteza());
        System.out.println(masina2.getMarca() + " viteza: " + masina2.getViteza());
        System.out.println(moto1.getMarca() + " viteza: " + moto1.getViteza());
        System.out.println(moto2.getMarca() + " viteza: " + moto2.getViteza());

        System.out.println("--- Motociclete de tip 'Sport' ---");
        garaj.afiseazaMotocicleteDeTip("Sport");

        System.out.println("--- Masini cu 2 usi ---");
        garaj.afiseazaMasiniCu2Usi();
    }
}
