import bandeau.Bandeau;

public class Rotation extends Effet{

    private int nombreDePasRotation;

    public Rotation (int nombreDePasRotation){

        this.nombreDePasRotation = nombreDePasRotation;
    }

    @Override
    public void animerBandeau(Bandeau bandeau) {

        float pasDeRotation = (float) ((2*Math.PI)/nombreDePasRotation);

        for(int i=0;i<nombreDePasRotation;i++){
            bandeau.setRotation(pasDeRotation);
            bandeau.sleep(400);
        }
       bandeau.setRotation(0.0f);

    }
}
