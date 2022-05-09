package main;

import clase.Autobuz;
import clase.ManagerAutobuze;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("model", "Popescu", 20, 1999);
        ManagerAutobuze managerAutobuze = new ManagerAutobuze();
        managerAutobuze.adaugaMemento(autobuz.creareMemento());

        autobuz.setNumeSOfer("NumeNou");
        managerAutobuze.adaugaMemento(autobuz.creareMemento());

        autobuz.setConsumMediu(15);
        managerAutobuze.adaugaMemento(autobuz.creareMemento());
        System.out.println(autobuz.toString());

        autobuz.revenireStareAnterioara(managerAutobuze.getMementoAutobuz(0));
        System.out.println(autobuz.toString());

    }
}
