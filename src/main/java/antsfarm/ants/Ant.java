package antsfarm.ants;

public class Ant {
    private static long counter = 0;
    private final long number;
    private final int birthDate;

    public Ant(){
        super();
        this.number = ++counter;
        this.birthDate = 1;
    }

    public int getAge() {
        int currentDate = 10;
        return currentDate-this.birthDate;
    }

    public boolean isWorker() {
        return false;
    }

    public boolean isWarrior() {
        return false;
    }

    public boolean isQueen() {
        return false;
    }

    @Override
    public String toString() {
        return "Ant{" +
                "number=" + number +
                ", birthDate=" + birthDate +
                '}';
    }
}
