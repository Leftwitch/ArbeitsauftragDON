package justinguckes.arbeitsauftrag.aufgabe5;

public final class Doppeldecker extends Flugzeug {
    static int LOOPINGSPEED = 150;

    private final boolean offenesCockpit;

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
        super(hersteller, maxSpeed);
        setImmatNummer(immatNummer);
        this.offenesCockpit = offenesCockpit;
    }

    public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
        this(hersteller, maxSpeed, immatNummer, true);
    }

    @Override
    public boolean getLooping() {
        return getMaxSpeed() > LOOPINGSPEED;
    }

    public boolean isOffenesCockpit() {
        return this.offenesCockpit;
    }
}
