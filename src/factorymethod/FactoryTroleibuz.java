package factorymethod;

public class FactoryTroleibuz implements Factory{
    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
