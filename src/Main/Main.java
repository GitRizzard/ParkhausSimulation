package Main;

public class Main {

  public static void main(String[] args) {

    int anzahlPlaetze = 50;
    double minutenPreis = 0.05;
    int anzahlKassen = 2;
    Parkhaus parkhaus = new Parkhaus(anzahlPlaetze, minutenPreis, anzahlKassen);

    TerminalUI terminal = new TerminalUI(parkhaus);
    // Steuerung starten
    terminal.menuLoop();

  }

}
