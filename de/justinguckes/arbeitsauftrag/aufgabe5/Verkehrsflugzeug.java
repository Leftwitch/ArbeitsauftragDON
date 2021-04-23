package justinguckes.arbeitsauftrag.aufgabe5;

public class Verkehrsflugzeug extends Flugzeug {
    private int passagiere;

    public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int passagiere) {
        super(hersteller, maxSpeed);
        setImmatNummer(immatNummer);
        this.passagiere = passagiere;
    }

    @Override
    public boolean getLooping() {
        return false;
    }

    public int getAnzahlPassagiere() {
        return passagiere;
    }

    protected void setAnzahlPassagiere(int passagiere) {
        this.passagiere = passagiere;
    }
}
