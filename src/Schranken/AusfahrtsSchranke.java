package Schranken;

import Main.Ticket;

public class AusfahrtsSchranke extends Schranke {

  //----------------------------------------------Konstruktoren------------------------------------------------//

  // Ausfahrt braucht keinen speziellen Konstruktor

  //--------------------------------------------Getter-und-Setter----------------------------------------------//

  // Schranken.EinfahrtsSchranke braucht keine Getter oder Setter

  //-----------------------------------------------Operationen-------------------------------------------------//

  public void benutzeSchranke(Ticket eingegebenesTicket) {
    if (eingegebenesTicket.isBezahlt()) {
      oeffneSchranke();
    }
  }


}
