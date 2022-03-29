package antsfarm.ants;

public class Queen extends Ant{
    private final int carrier;

    public Queen(int carrier) {
        super();
        this.carrier = 10000;
    }


    /**
     * @return the carrier
     */
    public int getCarrier() {
        return carrier;
    }

    //redefine method isQueen in Ant
    public boolean isQueen() {
        return true;
    }

    @Override
    public String toString() {
        return "Queen [carrier=" + carrier + ", getCarrier()=" + getCarrier() + "]";
    }




}
