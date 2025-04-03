public class TantariUrs extends Tantari {
    private int z = printInit("TantariUrs.z initializat");

    public TantariUrs() {
        System.out.println("Constructor TantariUrs");
        System.out.println("z = " + z);
    }

    private static int x5 = printInit("static TantariUrs.x5 initializat");
}
