public class Rechizita {
    protected String eticheta;

    public Rechizita(String eticheta) {
        this.eticheta = eticheta;
    }

    public String getNume() {
        return null;
    }
}public

public class Caiet extends Rechizita {
    public Caiet(String eticheta) {
        super(eticheta);
    }

    public String getNume() {
        return "Caiet: " + eticheta;
    }
}


public class Manual extends Rechizita {
    public Manual(String eticheta) {
        super(eticheta);
    }

    public String getNume() {
        return "Manual: " + eticheta;
    }
}

public class Ghiozdan {
