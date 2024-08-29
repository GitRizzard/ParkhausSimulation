package Main;

import Schranken.AusfahrtsSchranke;
import Schranken.EinfahrtsSchranke;

public class Parkhaus {

  private TicketRegister register;
  private EinfahrtsSchranke einfahrt;
  private AusfahrtsSchranke[] ausfahrten;
  private Kasse[] kassen;
  private int freiePlaetze;

  //----------------------------------------------Konstruktoren------------------------------------------------//

  public Parkhaus(int anzahlPlaetze, double minutenPreis, int anzahlKassen) {

    freiePlaetze = anzahlPlaetze;

    // Kassen instanzieren und initialisieren
    this.kassen = new Kasse[anzahlKassen];
    for (int i = 0; i < anzahlKassen; i++) {
      kassen[i] = new Kasse(minutenPreis);
    }

    // Ausfahrten instanzieren und initialisieren
    this.ausfahrten = new AusfahrtsSchranke[2];
    for (int i = 0; i < 2; i++) {
      ausfahrten[i] = new AusfahrtsSchranke();
    }

  }

  //--------------------------------------------Getter-und-Setter----------------------------------------------//

  public int getFreiePlaetze() {
    return freiePlaetze;
  }

  //-----------------------------------------------Operationen-------------------------------------------------//

  // Parkhaus muss keine eigenen Operationen ausführen

}


