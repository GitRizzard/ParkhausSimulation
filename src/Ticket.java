import java.util.Date;

public class Ticket{

  private int ticketID;
  private long startZeit;
  private boolean bezahlt = false;

  public Ticket(int nextTicketID){
    startZeit = new Date().getTime();
    ticketID = nextTicketID; 
  }

  public int getTicketID() {
    return ticketID;
  }

  public long getStartZeit() {
    return startZeit;
  }

  public void setBezahltTrue() {
    bezahlt = true;
  }


}
