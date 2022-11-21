import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends Effet {


    private int multiplicateurTaillePolice;

    public Zoom( int multiplicateurTaillePolice){

        this.multiplicateurTaillePolice = multiplicateurTaillePolice;
    }

    @Override
    public void animerBandeau(Bandeau bandeau) {

        String font = bandeau.getFont().getFontName();
        int fontSize = bandeau.getFont().getSize();
        for (int i = 5;i< fontSize*multiplicateurTaillePolice; i += 2) {
            bandeau.setFont  (new Font(font, Font.BOLD, 5 + i));
            bandeau.sleep(50);
        }
        bandeau.setFont  (new Font(font, Font.BOLD, 25));
    }
}
