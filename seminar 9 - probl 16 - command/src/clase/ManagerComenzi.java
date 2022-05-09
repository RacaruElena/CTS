package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstracta> comenzi;

    public ManagerComenzi() {
        comenzi = new ArrayList<>();
    }

    public void invoca(ComandaAbstracta comanda) {
        comenzi.add(comanda);
    }

    public void executa() {
        if (comenzi.size() > 0) {
            comenzi.get(0).executa();  //e o coada
            comenzi.remove(0);
        }
    }
}
