package Main;

public class TerminalUI implements IParkhausSchnittstelle{

    private Parkhaus parkhaus;

    public TerminalUI(Parkhaus parkhaus) {
        this.parkhaus = parkhaus;
    }

    @Override
    public void menuLoop() {

    }

    @Override
    public void geheZurEinfahrt() {

    }

    @Override
    public void geheZurKasse() {

    }

    @Override
    public void geheZurAusfahrt() {

    }

    @Override
    public int zeigeFreiPlaetze() {
        return 0;
    }
}
