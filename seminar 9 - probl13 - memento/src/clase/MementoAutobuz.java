package clase;

public class MementoAutobuz {
    private String numeSofer;
    private float consummemdiu;

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public float getConsummemdiu() {
        return consummemdiu;
    }

    public void setConsummemdiu(float consummemdiu) {
        this.consummemdiu = consummemdiu;
    }

    public MementoAutobuz(String numeSofer, float consummemdiu) {
        this.numeSofer = numeSofer;
        this.consummemdiu = consummemdiu;
    }
}
