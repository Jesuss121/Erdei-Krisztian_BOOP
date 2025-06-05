import animale.Cangur;
import animale.Koala;
import animale.Veverita;
import clinica.Clinica;
import enums.TipRana;
import exceptions.AnimaleIncompatibileException;
import exceptions.ClinicaFullException;

public class AplicatieClinica {
    public static void main(String[] args) {
        Clinica clinica = new Clinica();


        Cangur c1 = new Cangur("Cangur", TipRana.MEDIE, 2.5, true);
        Cangur c2 = new Cangur("Cangurel", TipRana.USOARA, 1.8, false);
        Koala k1 = new Koala("Koala", TipRana.GRAVA, 18, true);
        Veverita v1 = new Veverita("Veve1", TipRana.MEDIE, true);
        Veverita v2 = new Veverita("Alvin", TipRana.USOARA, false);

        try {
            clinica.evalueazaAnimal(c1);
            clinica.evalueazaAnimal(c2);
            clinica.evalueazaAnimal(k1);
            clinica.evalueazaAnimal(v1);
            clinica.evalueazaAnimal(v2);
        } catch (AnimaleIncompatibileException | ClinicaFullException ex) {
            System.err.println("Eroare la cazare: " + ex.getMessage());
        }

        System.out.println("\n");

        int camereLibere = clinica.calculeazaNumarulDeCamereLibere();
        System.out.println("Număr de camere complet libere: " + camereLibere);

        clinica.raportClinica();

        System.out.println("\n");

        clinica.decazeaza(c1);

        clinica.raportClinica();
    }
}