package Main;

public class Kasse {
  
  private double minutenPreis;

  public Kasse(double minutenPreis) {
    this.minutenPreis = minutenPreis;
  }

  public Ticket validiereZahlung(Ticket ticket) {
    return ticket;
  }

}
