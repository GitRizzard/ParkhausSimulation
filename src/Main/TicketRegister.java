package Main;

import java.util.ArrayList;

public class TicketRegister {

    private ArrayList<Ticket> tickets = new ArrayList<>();

    //----------------------------------------------Konstruktoren------------------------------------------------//

    // Keine speziellen Konstruktoren benötigt

    //--------------------------------------------Getter-und-Setter----------------------------------------------//

    public Ticket getTicketByID(int ID) {          
       
        Ticket ticket;
        if (tickets.stream().filter(t -> t.getTicketID() == ID).findFirst()) {
          ticket = t;
        }
        
        if (ticket.equals(null)) {
          // Ticket not found
          return null;
        }

        return ticket;
      
      }

      public int[] getUnbezahlteTicketIDs() {

          // Die Anzahl der unbezahlten Tickets wird gezählt
          int unbezahlteCount = 0;
          for (int i = 0; i < tickets.size(); i++) {
              if (!tickets.get(i).isBezahlt()) {
                  unbezahlteCount++;
              }
          }

          // Das Array für die Rückgabe wird initialisiert
        int[] unbezahlteTicketIDs = new int[unbezahlteCount];

        // index wird benötigt um den speicherindex in unbezahlteTicketID nur zu erhöhen, wenn eine ID hinzugefügt wird
        int index = 0;

        // Das Array wird mit den IDs der unbezahlten Tickets gefüllt
        for (int i = 0; i < tickets.size(); i++) {
            if (!tickets.get(i).isBezahlt()) {
                unbezahlteTicketIDs[index++] = tickets.get(i).getTicketID();
            }
        }

        return unbezahlteTicketIDs;
    }

    //-----------------------------------------------Operationen-------------------------------------------------//

    public int berechneNextID() {
        if (tickets.size() == 0) {
            return  1;
        } else {
            return (tickets.size() + 1);
        }
    }

    public void fuegeTicketHinzu(Ticket ticket) {
        tickets.add(ticket);
    }

}
