package clinica;

import animale.Animal;
import exceptions.AnimaleIncompatibileException;
import exceptions.ClinicaFullException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Camera {
    private final int id;
    private final Class<? extends Animal> speciePermisa;
    private final List<Animal> animaleCazate;
    private static final int MAX_CAPACITATE = 5;

    public Camera(int id, Class<? extends Animal> speciePermisa) {
        this.id = id;
        this.speciePermisa = speciePermisa;
        this.animaleCazate = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Class<? extends Animal> getSpeciePermisa() {
        return speciePermisa;
    }

    public List<Animal> getAnimaleCazate() {
        return Collections.unmodifiableList(animaleCazate);
    }

    public int getNumarAnimale() {
        return animaleCazate.size();
    }

    public int getLocuriLibere() {
        return MAX_CAPACITATE - animaleCazate.size();
    }


    public void adaugaAnimal(Animal a) throws AnimaleIncompatibileException, ClinicaFullException {

        if (!speciePermisa.isInstance(a)) {
            throw new AnimaleIncompatibileException(
                    "Specia animalului (" + a.getSpecie() + ") nu se potriveste cu specia camerei: "
                            + speciePermisa.getSimpleName());
        }

        if (animaleCazate.size() >= MAX_CAPACITATE) {
            throw new ClinicaFullException(
                    "Camera " + id + " este plina. Nu se mai pot caza animale de tip " + a.getSpecie());
        }
        animaleCazate.add(a);

        //Presupunere: data cazarii trebuie sa fie egala cu data la care se adauga animalul
        a.setDataCazare(LocalDateTime.now());
    }

    public boolean eliminaAnimal(Animal a) {
        return animaleCazate.remove(a);
    }


    public boolean esteGoala() {
        return animaleCazate.isEmpty();
    }
}
