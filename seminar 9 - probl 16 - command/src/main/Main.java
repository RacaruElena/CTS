package main;

import clase.Autobuz;
import clase.ComandaAbstracta;
import clase.ManagerComenzi;
import clase.PleacaInCursa;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("model");
        Autobuz autobuz2 = new Autobuz("model1");
        Autobuz autobuz3 = new Autobuz("model2");

        ManagerComenzi managerComenzi = new ManagerComenzi();

        managerComenzi.invoca(new PleacaInCursa(autobuz1, 331));
        managerComenzi.invoca(new PleacaInCursa(autobuz2, 341));
        managerComenzi.invoca(new PleacaInCursa(autobuz3, 351));
        managerComenzi.invoca(new PleacaInCursa(autobuz1, 401));
        managerComenzi.invoca(new PleacaInCursa(autobuz2, 241));
        managerComenzi.invoca(new PleacaInCursa(autobuz3, 451));

        managerComenzi.executa();
        managerComenzi.executa();
        managerComenzi.executa();
        managerComenzi.executa();
        managerComenzi.executa();
        managerComenzi.executa();
    }
}
