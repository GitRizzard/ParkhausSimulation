package Schranken;

import Main.Ticket;

public class EinfahrtsSchranke extends Schranke {

  //----------------------------------------------Konstruktoren------------------------------------------------//

  // Einfahrt braucht keinen speziellen Konstruktor

  //--------------------------------------------Getter-und-Setter----------------------------------------------//

  // Schranken.EinfahrtsSchranke braucht keine Getter oder Setter

  //-----------------------------------------------Operationen-------------------------------------------------//

  public Ticket printNewTicket(int ID) {

    Ticket neuesTicket = new Ticket(ID);
    return neuesTicket;

  }

  public void benutzeSchranke() {
    oeffneSchranke();
  }

}
