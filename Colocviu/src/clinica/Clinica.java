package clinica;

import animale.Animal;
import animale.Cangur;
import animale.Koala;
import animale.Veverita;
import enums.TipRana;
import exceptions.AnimaleIncompatibileException;
import exceptions.ClinicaFullException;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private final List<Camera> camere;

    public Clinica() {
        camere = new ArrayList<>();


        camere.add(new Camera(1, Cangur.class));
        camere.add(new Camera(2, Cangur.class));

        camere.add(new Camera(3, Koala.class));
        camere.add(new Camera(4, Koala.class));

        camere.add(new Camera(5, Veverita.class));
        camere.add(new Camera(6, Veverita.class));
    }
    
    public void evalueazaAnimal(Animal a) throws ClinicaFullException, AnimaleIncompatibileException {
        TipRana tip = a.getTipRana();
        if (tip == TipRana.MEDIE || tip == TipRana.GRAVA) {

            cazeaza(a);
        } else {

            System.out.println("Animalul " + a.getNume() + " are ranire usoara. Nu este necesara cazarea.");
        }
    }
    
    public void cazeaza(Animal a) throws ClinicaFullException, AnimaleIncompatibileException {
        boolean cazaReusita = false;
        for (Camera cam : camere) {

            if (cam.getSpeciePermisa().isInstance(a)) {

                if (cam.getLocuriLibere() > 0) {
                    cam.adaugaAnimal(a);
                    System.out.println("Animalul " + a.getNume() + " (" + a.getSpecie() + ") a fost cazat in camera "
                            + cam.getId() + " la data " + a.getDataCazare());
                    cazaReusita = true;
                    break;
                }
            }
        }
        if (!cazaReusita) {

            throw new ClinicaFullException(
                    "Clinica este plina pentru specia: " + a.getSpecie() + ". Nu exista locuri libere.");
        }
    }


    public void decazeaza(Animal a) {
        boolean gasit = false;
        for (Camera cam : camere) {
            if (cam.getSpeciePermisa().isInstance(a)) {
                boolean sters = cam.eliminaAnimal(a);
                if (sters) {
                    System.out.println("Animalul " + a.getNume() + " a fost decazat din camera " + cam.getId());
                    gasit = true;
                    break;
                }
            }
        }
        if (!gasit) {
            System.out.println("Animalul " + a.getNume() + " nu a fost gasit in clinica.");
        }
    }

    public int calculeazaNumarulDeCamereLibere() {
        int count = 0;
        for (Camera cam : camere) {
            if (cam.esteGoala()) {
                count++;
            }
        }
        return count;
    }


    public void raportClinica() {

        int countCanguri = 0;
        int countKoala = 0;
        int countVeverite = 0;
        for (Camera cam : camere) {
            for (Animal a : cam.getAnimaleCazate()) {
                if (a instanceof Cangur) {
                    countCanguri++;
                } else if (a instanceof Koala) {
                    countKoala++;
                } else if (a instanceof Veverita) {
                    countVeverite++;
                }
            }
        }
        int totalSpeciiPrezente = 0;
        if (countCanguri > 0) totalSpeciiPrezente++;
        if (countKoala > 0) totalSpeciiPrezente++;
        if (countVeverite > 0) totalSpeciiPrezente++;
        int totalAnimale = countCanguri + countKoala + countVeverite;

        System.out.println("In clinica se afla " + totalSpeciiPrezente + " specii de animale diferite dintre care:");
        System.out.println(countCanguri + " canguri,");
        System.out.println(countKoala + " koala,");
        System.out.println(countVeverite + " veverite.");
        System.out.println("In total in clinica se afla " + totalAnimale + " animale.");
    }


    public void afiseazaToateAnimalele() {
        for (Camera cam : camere) {
            System.out.print("Camera " + cam.getId() + " (" + cam.getSpeciePermisa().getSimpleName() + "): ");
            if (cam.getAnimaleCazate().isEmpty()) {
                System.out.println("Goala");
            } else {
                for (Animal a : cam.getAnimaleCazate()) {
                    System.out.print(a.getNume() + "(" + a.getSpecie() + ", " + a.getTipRana() + ")  ");
                }
                System.out.println();
            }
        }
    }
}
