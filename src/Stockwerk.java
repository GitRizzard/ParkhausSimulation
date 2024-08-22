public class Stockwerk {

  private Parkplatz[] parkplaetze;
  private Kasse[] kassen;
  private int stockwerkNummer;

  public Stockwerk(int anzahlParkplaetze, int anzahlKassen, int stockwerkNummer){
    
    this.stockwerkNummer = stockwerkNummer;

    this.parkplaetze = new Parkplatz[anzahlParkplaetze];
    for (int i = 0; i < anzahlParkplaetze; i++) {
      parkplaetze[i] = new Parkplatz(i + 1 + (100 * stockwerkNummer));
    }
  
    this.kassen = new Kasse[anzahlKassen];
    for (int i = 0; i < anzahlKassen; i++) {
      kassen[i] = new Kasse(0.05);
    }

  }

  public Parkplatz[] getParkPlaetze() {
    return parkplaetze;
  }

}
