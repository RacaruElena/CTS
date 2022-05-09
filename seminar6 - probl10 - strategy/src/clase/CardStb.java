package clase;

public class CardStb implements ModPlata {
    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata fplata prin card stb in valoare de " + pret);
    }
}
