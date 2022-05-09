package program;

import clase.Autobuz;
import clase.Linie;
import flyweight_factory.FlyweightFactory;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("model1", 1999, 50);
        Autobuz autobuz2 = new Autobuz("model2", 1998, 40);
        Autobuz autobuz3 = new Autobuz("model3", 1997, 60);
        Autobuz autobuz4 = new Autobuz("model4", 1996, 55);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Linie linie1 = flyweightFactory.getLinie(168);
        Linie linie2 = flyweightFactory.getLinie(190);

        autobuz1.descriere(linie1);
        // sau autobuz1.descriere(flyweightFactory.getLinie(168));
        autobuz2.descriere(linie1);
        autobuz3.descriere(linie2);
        autobuz4.descriere(linie2);
    }
}
