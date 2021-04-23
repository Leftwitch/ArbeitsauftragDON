package justinguckes.arbeitsauftrag.aufgabe5;

public abstract class Flugzeug {

    private String hersteller, immatNummer;
    private int maxSpeed, anzahlFluegel;

    public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
        this.hersteller = hersteller;
        this.maxSpeed = maxSpeed;
        this.anzahlFluegel = anzahlFluegel;
    }

    public Flugzeug(String hersteller, int maxSpeed) {
        this(hersteller, maxSpeed, 1);
    }

    public String getImmatNummer() {
        return this.immatNummer;
    }

    protected void setImmatNummer(String immatNummer) {
        this.immatNummer = immatNummer;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract boolean getLooping();
}
