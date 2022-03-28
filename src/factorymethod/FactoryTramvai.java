package factorymethod;

public class FactoryTramvai implements Factory{
    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
