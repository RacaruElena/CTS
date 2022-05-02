package clase;

public class TroleibuzHandler extends Handler{

    public TroleibuzHandler(int prag) {
        super(prag);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void afiseazaCuCatSeDeplaseaza(int distanta) {
        if(distanta<prag) {
            System.out.println("Te poti deplasa cu troleibuzul");
        }else {
            nextHandler.afiseazaCuCatSeDeplaseaza(distanta);
        }

    }


}
