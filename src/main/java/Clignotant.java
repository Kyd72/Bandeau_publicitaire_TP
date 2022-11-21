import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet{

    private int millis;
    public Clignotant(int millis){

        this.millis = millis;
    }

    @Override
    public void animerBandeau(Bandeau bandeau) {

        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.sleep(millis);
        bandeau.setBackground(Color.YELLOW);
        bandeau.sleep(millis);
        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.sleep(millis);
        bandeau.setBackground(Color.YELLOW);
        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.sleep(millis);
        bandeau.setBackground(Color.YELLOW);
        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.sleep(millis);
        bandeau.setBackground(Color.YELLOW);




    }
}
