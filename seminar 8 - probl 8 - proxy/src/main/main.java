package main;

import clase.Autobuz;
import clase.MijlocTransport;
import clase.MijlocTransportNoapte;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("a1", 20);
        Autobuz autobuz2 = new Autobuz("a2", 0);
        MijlocTransportNoapte mijlocTransportNoapte1 = new MijlocTransportNoapte(autobuz1);
        MijlocTransportNoapte mijlocTransportNoapte2 = new MijlocTransportNoapte(autobuz2);
        autobuz1.opresteInStatie();
        autobuz2.opresteInStatie();
        mijlocTransportNoapte1.opresteInStatie();
        mijlocTransportNoapte2.opresteInStatie();

    }
}
