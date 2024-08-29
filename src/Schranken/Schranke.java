package Schranken;

public abstract class Schranke {

    protected boolean istOffen = false;

    //----------------------------------------------Konstruktoren------------------------------------------------//

    // Schranke ist eine Superklasse und braucht keine Konstruktoren

    //--------------------------------------------Getter-und-Setter----------------------------------------------//

    // Schranken brauchen keine Getter oder Setter

    //-----------------------------------------------Operationen-------------------------------------------------//

    protected void oeffneSchranke() {

        istOffen = true;

        // Wenn Auto durchgefahren ist, Schranke wieder schliessen
        istOffen = false;

    }

}
