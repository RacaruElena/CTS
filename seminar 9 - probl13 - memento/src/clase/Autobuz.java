package clase;

public class Autobuz {
    private String model;
    private String numeSOfer;
    private float consumMediu;
    private int anFabricatie;

    public Autobuz(String model, String numeSOfer, float consumMediu, int anFabricatie) {
        this.model = model;
        this.numeSOfer = numeSOfer;
        this.consumMediu = consumMediu;
        this.anFabricatie = anFabricatie;
    }

    public MementoAutobuz creareMemento() {
        return new MementoAutobuz(numeSOfer, consumMediu);
    }

    public void revenireStareAnterioara(MementoAutobuz mementoAutobuz) {
        this.numeSOfer = mementoAutobuz.getNumeSofer();
        this.consumMediu = mementoAutobuz.getConsummemdiu();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSOfer(String numeSOfer) {
        this.numeSOfer = numeSOfer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", numeSOfer='" + numeSOfer + '\'' +
                ", consumMediu=" + consumMediu +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
