package clase;

public interface Item {
    void adaugaItem(Item item) throws Exception;

    void stergeItem(Item item) throws Exception;

    void descriereItem();

    Item getItem(int pozitie) throws Exception;

    float calculeazaSumaGarantata(float pretPerLoc);
}
