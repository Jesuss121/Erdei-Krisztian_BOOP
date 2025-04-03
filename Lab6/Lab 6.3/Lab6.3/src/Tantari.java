public class Tantari extends Insecta {
    private int t = printInit("Tantari.t initializat");

    public Tantari() {
        System.out.println("Constructor Tantari");
        System.out.println("t = " + t);
    }

    private static int x3 = printInit("static Tantari.x3 initializat");
}
