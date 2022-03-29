package antsfarm;

import antsfarm.ants.Ant;

public class AntsGame {
    public static void main(String[] args) {
        System.out.println("Bonjour");

        Ant f1 = new Ant();
        Ant f2 = new Ant();
        Ant f3 = new Ant();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        Antsfarm antsfarm = new Antsfarm();
        System.out.println(antsfarm);
        System.out.println("Number of workers =" + antsfarm);
        System.out.println("the cleaning :" + antsfarm.getTheCleaning());
    }
}
