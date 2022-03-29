package antsfarm.ants;

public class Warrior extends Ant{
    public int power;


    public Warrior(int power) {
        super();
        this.power = 1; //random
    }


    /**
     * @return the force
     */
    public int getPower() {
        return power;
    }

    public boolean isWarrior() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.power + ")";
    }

}
