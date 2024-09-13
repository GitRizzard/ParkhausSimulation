package Main;

import java.util.Date;

public class Ticket{

  private int ticketID;
  private long startZeit;
  private boolean istBezahlt = false;
  private double preis;

  //----------------------------------------------Konstruktoren------------------------------------------------//

  public Ticket(int ID){
    this.startZeit = new Date().getTime();
    ticketID = ID;
  }
  //--------------------------------------------Getter-und-Setter----------------------------------------------//

  public double getPreis() {
    return preis;
  }

  public boolean isBezahlt() {
    return istBezahlt;
  }
  
  @FunctionalInterface
  interface getTicketIDInterface {
    int funcitonalGetTicketID();
  }

  getTicketIDInterface getTicketIDImplementation = () -> ticketID;

  public int getTicketID() {
    return getTicketIDImplementation.funcitonalGetTicketID();
  }

  //-----------------------------------------------Operationen-------------------------------------------------//

  public void berechnePreis(double minutenPreis) {
    long aktuelleZeit = new Date().getTime();
    long laufZeit = aktuelleZeit - startZeit;
    double laufZeitKonvertiert = (double) laufZeit / (1000 * 60);
    double laufZeitGerundet = Math.ceil(laufZeitKonvertiert);
    preis = minutenPreis * laufZeitGerundet;
  }

  public void bezahleTicket() {
    istBezahlt = true;
  }

}
