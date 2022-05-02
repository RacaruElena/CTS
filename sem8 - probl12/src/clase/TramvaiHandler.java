package clase;

public class TramvaiHandler extends Handler {

    public TramvaiHandler(int prag) {
        super(prag);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void afiseazaCuCatSeDeplaseaza(int distanta) {
        if(distanta<prag) {
            System.out.println("Te poti deplasa cu tramvaiul");
        }else {
            nextHandler.afiseazaCuCatSeDeplaseaza(distanta);
        }
    }

}
