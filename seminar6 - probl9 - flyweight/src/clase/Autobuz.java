package clase;

public class Autobuz implements AutobuzLinie{
    private String model;
    private int anFabricare;
    private int nrLocuri;

    public Autobuz(String model, int anFabricare, int nrLocuri) {
        this.model = model;
        this.anFabricare = anFabricare;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriere(Linie linie) {
        System.out.println("Linie: "  + linie.toString() + "Autobuz" + this.toString());
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", anFabricare=" + anFabricare +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
