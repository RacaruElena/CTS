package program;

import clase.Autobuz;
import clase.Flota;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("prod1", "A1", 10);
        Autobuz autobuz2 = new Autobuz("prod1", "A1", 7);
        Autobuz autobuz3 = new Autobuz("prod1", "A1", 30);
        Autobuz autobuz4 = new Autobuz("prod1", "A1", 100);
        Autobuz autobuz5 = new Autobuz("prod1", "A1", 30);
        Autobuz autobuz6 = new Autobuz("prod1", "A1", 45);

        Flota flota1 = new Flota("Flota1");
        Flota flota2 = new Flota("Flota2");
        Flota flota3 = new Flota("Flota3");
        Flota flotaMare = new Flota("Flota companie");

        try {
            flota1.adaugaItem(autobuz1);
            flota1.adaugaItem(autobuz2);
            flota2.adaugaItem(autobuz3);
            flota3.adaugaItem(autobuz4);
            flota3.adaugaItem(autobuz5);
            flota3.adaugaItem(autobuz6);

            flotaMare.adaugaItem(flota1);
            flotaMare.adaugaItem(flota2);
            flotaMare.adaugaItem(flota3);

            flotaMare.descriereItem();
            flotaMare.stergeItem(flota1);
            flotaMare.descriereItem();

            System.out.println("Suma totala garantata = " +
                    flotaMare.calculeazaSumaGarantata(3));
            System.out.println("Suma totala garantata flota 3 = " +
                    flota3.calculeazaSumaGarantata(3));

        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}
