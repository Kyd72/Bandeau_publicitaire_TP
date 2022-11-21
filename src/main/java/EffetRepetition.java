public class EffetRepetition {
    private Effet effet;
    private int repetition ;

    public EffetRepetition( Effet effet, int repetition ) {
        this.effet = effet;
        this.repetition = repetition;
    }

    public Effet getEffet() {
        return effet;
    }

    public int getRepetition() {
        return repetition;
    }
}
