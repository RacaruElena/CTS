package factory;

public class MijlocTransport {
    private int nrInmatriculare;

    public MijlocTransport(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "MijlocTransport{" +
                "nrInmatriculare=" + nrInmatriculare +
                '}';
    }
}
