package Singleton;

public class Repartitor {
    private static Repartitor repartitor = null;

    private Repartitor() {

    }


    public static synchronized Repartitor getInstance() {
        if (repartitor == null) {
            repartitor = new Repartitor();
        }
        return repartitor;
    }

}
