import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Scenario {

    private HashMap<Effet, Integer > listeEffets = new HashMap<Effet, Integer>();

    public Scenario () {    };

    public void ajouterEffet (Effet effet, int nombreDeRepetition) {
        listeEffets.put(effet, nombreDeRepetition);
    }



    public void deroulerAnimation(Bandeau bandeau){

        for (Map.Entry<Effet, Integer> entry : listeEffets.entrySet()) {

            for(int i=0; i<entry.getValue(); i++)

            {
            entry.getKey().animerBandeau(bandeau);
                bandeau.sleep(500);
            }
            bandeau.sleep(500);

        }
    }




}
