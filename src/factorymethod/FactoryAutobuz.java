package factorymethod;

public class FactoryAutobuz implements Factory{
    @Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
