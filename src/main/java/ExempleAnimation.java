import bandeau.Bandeau;

import javax.sound.sampled.Clip;

public class ExempleAnimation {

    public static void main(String[] args) {


        Scenario scenario = new Scenario();

        Rotation maRotation = new Rotation(3);
        Zoom scale = new Zoom(2);
        Clignotant z = new Clignotant(50);

        scenario.ajouterEffet(maRotation, 6);
        scenario.ajouterEffet(scale,1);
        scenario.ajouterEffet(z,6);

        Bandeau monBandeau = new Bandeau();
        monBandeau.setMessage("FRANCE - DANEMARK 5-0");
        scenario.deroulerAnimation(monBandeau);

    }




}
