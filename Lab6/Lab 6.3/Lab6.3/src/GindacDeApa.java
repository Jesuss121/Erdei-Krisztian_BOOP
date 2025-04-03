public class GindacDeApa extends Gindac {
    private int w = printInit("GindacDeApa.w initializat");

    public GindacDeApa() {
        System.out.println("Constructor GindacDeApa");
        System.out.println("w = " + w);
    }

    private static int x4 = printInit("static GindacDeApa.x4 initializat");
}
