package antsfarm.ants;

public class Worker extends Ant{
    private TypeWorker type;

    public Worker(TypeWorker t) {
        super();
        this.type=t;

    }

    /**
     * @return the type
     */
    public TypeWorker getType() {
        return type;
    }


    // redefine method in Ant
    public boolean isWorker() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "( role = " + this.type + ")";
    }


}
