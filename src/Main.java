import java.util.Scanner;

public class Main {

  private static Parkhaus parkhaus;

  public static void main(String[] args) {
    parkhaus = new Parkhaus(2, 4);
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Willkommen im Parkhaus Sami");
    menu();
    scanner.close();
    freieParkplaetze();
  }
  
  public static void menu() {
    System.out.println("[1]|Freie Parkplätze anzeigen   [2]|Auto Einfahren   [3]|Tickt bezahlen   [4]|Auto ausfahren");
  }

  public static void freieParkplaetze() {
    Stockwerk[] stockwerke = parkhaus.getStockwerke();
    for (int i = 0; i < stockwerke.length; i++) {
      Stockwerk aktuellesStockwerk = stockwerke[i];
      Parkplatz[] parkplaetze = aktuellesStockwerk.getParkPlaetze();

    }

  }

}
