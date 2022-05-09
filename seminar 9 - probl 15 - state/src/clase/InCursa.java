package clase;

public class InCursa implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if (autobuz.getStare() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " pleaca in cursa");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul cu numarul " + autobuz.getNrAutobuz() + " nu poate sa plece in cursa");
        }
    }
}
