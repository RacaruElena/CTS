package factorymethod.Program;

import factorymethod.*;

public class Program {
    private static void afisareMijlocTransport(Factory fabrica, int nrInmatriculare){
        MijlocTransport mijlocTransport = fabrica.getMijlocTransport(nrInmatriculare);
        System.out.println(mijlocTransport.toString());
    }
    public static void main(String[] args) {
//        MijlocTransport autobuz = new FactoryAutobuz().getMijlocTransport(1);
//        MijlocTransport troleibuz = new FactoryTroleibuz().getMijlocTransport(2);
//        MijlocTransport tramvai = new FactoryTramvai().getMijlocTransport(4);
//
//        System.out.println(autobuz.toString());
//        System.out.println(troleibuz.toString());
//        System.out.println(tramvai.toString());

        afisareMijlocTransport(new FactoryAutobuz(),100);
        afisareMijlocTransport(new FactoryTramvai(),102);
    }
}
