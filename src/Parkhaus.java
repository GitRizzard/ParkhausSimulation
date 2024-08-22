import java.util.ArrayList; 

public class Parkhaus {

  //private Anzeige anzeige;
  private Einfahrtsschranke einfahrtsschranke;
  private Ausfahrtsschranke[] ausfahrtsschranken;
  private Stockwerk[] stockwerke;
  
  public Parkhaus(int anzahlAusfahrten, int anzahlStockwerke){

    // this.anzeige = new Anzeige();

    this.einfahrtsschranke = new Einfahrtsschranke();

    this.ausfahrtsschranken = new Ausfahrtsschranke[anzahlAusfahrten];
    for (int i = 0; i < anzahlAusfahrten; i++) {
      ausfahrtsschranken[i] = new Ausfahrtsschranke();
    }

    this.stockwerke = new Stockwerk[anzahlStockwerke];
    for (int i = 0; i < anzahlStockwerke; i++) {
      stockwerke[i] = new Stockwerk(30, 2, i+1);
    }


  }

  public Stockwerk[] getStockwerke(){
    return stockwerke;
  }

}
