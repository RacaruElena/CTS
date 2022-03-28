package factory.main;

import factory.Factory;
import factory.MijlocTransport;
import factory.TipMijlocTransport;

public class main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        MijlocTransport autobuz = fabrica.getMijlocTransport(TipMijlocTransport.AUTOBUZ, 1);
        MijlocTransport troleibuz = fabrica.getMijlocTransport(TipMijlocTransport.TROLEIBUZ, 2);
        MijlocTransport tramvai = fabrica.getMijlocTransport(TipMijlocTransport.TRAMVAI, 3);

        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());
    }
}
