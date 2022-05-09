package clase;

public class LaReparat implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " intra in service");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " trebuie sa ajunga la capat de linie");
        }
    }
}
