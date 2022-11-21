import bandeau.Bandeau;

public abstract class Effet {

    public Effet() {};

    public abstract void animerBandeau(Bandeau bandeau) ;

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
