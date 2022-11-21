import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private ArrayList<EffetRepetition> listeEffets = new ArrayList<EffetRepetition>();

    public Scenario () {    };

    public void ajouterEffet (Effet effet, int nombreDeRepetition) {
        listeEffets.add(new EffetRepetition(effet, nombreDeRepetition)) ;
    }



    public void deroulerAnimation(Bandeau bandeau){

        for (EffetRepetition effetRepetition : listeEffets) {

            for(int i=0; i<effetRepetition.getRepetition(); i++)

            {
            effetRepetition.getEffet().animerBandeau(bandeau);
                bandeau.sleep(500);
            }
            bandeau.sleep(500);

        }
    }




}
