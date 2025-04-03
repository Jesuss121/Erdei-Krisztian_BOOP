public class Ghiozdan {
    private Rechizita[] lista = new Rechizita[100];
    private int nr = 0;

    public void add(Caiet c) {
        lista[nr] = c;
        nr++;
    }

    public void add(Manual m) {
        lista[nr] = m;
        nr++;
    }

    public void listItems() {
        for (int i = 0; i < nr; i++) {
            System.out.println(lista[i].getNume());
        }
    }

    public void listCaiet() {
        for (int i = 0; i < nr; i++) {
            if (lista[i] instanceof Caiet) {
                System.out.println(lista[i].getNume());
            }
        }
    }

    public void listManual() {
        for (int i = 0; i < nr; i++) {
            if (lista[i] instanceof Manual) {
                System.out.println(lista[i].getNume());
            }
        }
    }

    public int getNrRechizite() {
        return nr;
    }

    public int getNrCaiete() {
        int count = 0;
        for (int i = 0; i < nr; i++) {
            if (lista[i] instanceof Caiet) {
                count++;
            }
        }
        return count;
    }

    public int getNrManuale() {
        int count = 0;
        for (int i = 0; i < nr; i++) {
            if (lista[i] instanceof Manual) {
                count++;
            }
        }
        return count;
    }
}
