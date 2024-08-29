package Main;

import java.util.ArrayList;

public class TicketRegister {

    private ArrayList<Ticket> tickets = new ArrayList<>();

    //----------------------------------------------Konstruktoren------------------------------------------------//

    // Keine speziellen Konstruktoren benötigt

    //--------------------------------------------Getter-und-Setter----------------------------------------------//

    public Ticket getTicketByID(int ID) {

        // IDs beginnen bei 1, daher Index = ID - 1
        if (ID > 0 && ID <= tickets.size()) {
            return tickets.get(ID - 1);
        } else {
            // ID ist ungültig oder Main.Ticket existiert nicht
            System.out.println("Main.Ticket-ID ist ungültig:" + ID);
            return null;
        }

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
