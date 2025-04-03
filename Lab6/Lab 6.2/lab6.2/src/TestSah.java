import java.util.Scanner;

abstract class PiesaSah {
    protected String numePiesa;
    protected int coordX;
    protected int coordY;

    public PiesaSah(String numePiesa, int coordX, int coordY) {
        this.numePiesa = numePiesa;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public abstract boolean mutaPiesa(int newX, int newY);

    public void afiseazaPozitie() {
        System.out.println(numePiesa + " este la pozitia: (" + coordX + ", " + coordY + ")");
    }
}

class Tura extends PiesaSah {
    public Tura(int x, int y) {
        super("Tura", x, y);
    }

    @Override
    public boolean mutaPiesa(int newX, int newY) {
        if (newX == coordX || newY == coordY) {
            coordX = newX;
            coordY = newY;
            return true;
        }
        return false;
    }
}

class Nebun extends PiesaSah {
    public Nebun(int x, int y) {
        super("Nebun", x, y);
    }

    @Override
    public boolean mutaPiesa(int newX, int newY) {
        if (Math.abs(newX - coordX) == Math.abs(newY - coordY)) {
            coordX = newX;
            coordY = newY;
            return true;
        }
        return false;
    }
}

class Pion extends PiesaSah {
    public Pion(int x, int y) {
        super("Pion", x, y);
    }

    @Override
    public boolean mutaPiesa(int newX, int newY) {
        if (newX == coordX && newY == coordY + 1) {
            coordY = newY;
            return true;
        }
        return false;
    }
}

public class TestSah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PiesaSah[] tabla = new PiesaSah[3];
        tabla[0] = new Tura(0, 0);
        tabla[1] = new Nebun(2, 0);
        tabla[2] = new Pion(4, 1);

        for (PiesaSah piesa : tabla) {
            piesa.afiseazaPozitie();
        }

        System.out.println("Alegeti piesa de mutat (0 - Tura, 1 - Nebun, 2 - Pion):");
        int index = scanner.nextInt();

        System.out.println("Introduceti coordonatele noi (X Y):");
        int newX = scanner.nextInt();
        int newY = scanner.nextInt();

        boolean mutareReusita = tabla[index].mutaPiesa(newX, newY);

        if (mutareReusita) {
            System.out.println("Mutare valida. Noua pozitie:");
        } else {
            System.out.println("Mutare invalida! Pozitia ramane neschimbata:");
        }

        tabla[index].afiseazaPozitie();
        scanner.close();
    }
}
