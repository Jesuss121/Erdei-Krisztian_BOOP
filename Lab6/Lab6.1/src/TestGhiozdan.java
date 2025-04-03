public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan g = new Ghiozdan();

        g.add(new Caiet("Matematica"));
        g.add(new Caiet("Romana"));
        g.add(new Manual("Istorie"));
        g.add(new Manual("Geografie"));

        System.out.println("Total rechizite: " + g.getNrRechizite());
        System.out.println("Total caiete: " + g.getNrCaiete());
        System.out.println("Total manuale: " + g.getNrManuale());

        System.out.println("\nToate rechizitele:");
        g.listItems();

        System.out.println("\nDoar caiete:");
        g.listCaiet();

        System.out.println("\nDoar manuale:");
        g.listManual();
    }
}
