package antsfarm;

import antsfarm.ants.*;
import java.util.ArrayList;
import java.util.List;

class Antsfarm {
    private List<Ant> theAnts = new ArrayList<Ant>();


    public Antsfarm() {
        super();
        Ant warrior = new Warrior(2);
        this.add(warrior);
        Ant worker1 = new Worker(TypeWorker.HUNT);
        this.add(worker1);
        Ant worker2 = new Worker(TypeWorker.CLEAN);
        this.add(worker2);
        Ant worker3 = new Worker(TypeWorker.NURSE);
        this.add(worker3);
        Ant queen = new Queen(4);
        this.add(queen);

    }

    public int getNbWorkers() {
        int rep=0;
        for ( Ant ant : theAnts) {
            if (ant.isWorker()) {
                rep++;
            }
            //nothing
        }
        return rep;
    }

    public List<Ant> getTheCleaning() {
        List<Ant> rep = new ArrayList<Ant>();
        for ( Ant ant : theAnts) {
            if (ant.isWorker()) {
                Worker worker = (Worker) ant;
                if (worker.getType() == TypeWorker.CLEAN) {
                    rep.add(worker);
                }
            }
            //nothing
        }
        return rep;
    }

    public int size() {
        return theAnts.size();
    }

    public boolean add(Ant f) {
        return theAnts.add(f);
    }

    public Ant get(int i) {
        return theAnts.get(i);
    }

    public Ant remove(int i) {
        return theAnts.remove(i);
    }

    @Override
    public String toString() {
        return "people =" + this.size() +" ants :\n the ants = " + theAnts;
    }

}
