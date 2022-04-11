package clase;

public class ImprimantaBilete implements Iimprimanta {
    private float pretBilet;

    public ImprimantaBilete(float pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul are pretul: " + pretBilet);
    }
}
