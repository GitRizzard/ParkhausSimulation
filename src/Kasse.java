import java.util.ArrayList;
import java.util.Date;

public class Kasse {
  
  private double preis;
  private Ticket eingegebenesTicket;
  private double minutenPreis;
  private static ArrayList<Ticket> tickets = new ArrayList<>();
  private int nextTicketID;


  public Kasse(double minutenPreis) {
    this.minutenPreis = minutenPreis;
  }

  public double getPreis(){
    return preis;
  }
 
  public void setNextTicketID() {
    if (tickets.size() == 0) {
      nextTicketID = 1;
    } else {
      Ticket lastTicket = tickets.getLast();
      int nextID = lastTicket.getTicketID() + 1;
      nextTicketID = nextID;
    }    
  }

  public int getNextTicketID() {
    return nextTicketID;
  }

  public void setAktuellesTicket(int ticketID){
    int aktuelleTicketID;
    Ticket aktuellesTicket;
    for (int i = 0; i < tickets.size(); i++) {
      aktuelleTicketID = tickets.get(i).getTicketID();
      aktuellesTicket = tickets.get(i);
      if (aktuelleTicketID == ticketID) {
        eingegebenesTicket = aktuellesTicket;
      } 
    }
  }

  public void ticketPreisBerechnen() {
    long aktuelleZeit = new Date().getTime();
    long TicketLaufZeit = eingegebenesTicket.getStartZeit() - aktuelleZeit;
    double preisBerechnet = minutenPreis* TicketLaufZeit  ;
    preis = preisBerechnet;
  }

  private void zahlungValidieren(double geld) {
    if (geld == preis) {
      ticketBezahlen();
    }
  }

  private void ticketBezahlen() {
    for (int i = 0; i < tickets.size(); i++) {

    }
  }

}
