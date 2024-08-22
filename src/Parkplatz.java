public class Parkplatz {

  private int parkplatzNummer;
  private boolean istFrei = true;

  public int getParkplatzNummer() {
    return parkplatzNummer;
  }

  public boolean getIstFrei() {
    return istFrei;
  }

  public void setIstFrei(boolean istFrei) {
    this.istFrei = istFrei;
  }

  public Parkplatz(int ID){
    parkplatzNummer = ID;
  }

}
