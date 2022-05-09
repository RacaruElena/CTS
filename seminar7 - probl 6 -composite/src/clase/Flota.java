package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Item {
    private String nume;
    private List<Item> items;

    public Flota(String nume) {
        this.nume = nume;
        items = new ArrayList<>();
    }

    @Override
    public void adaugaItem(Item item) throws Exception {
        items.add(item);
    }

    @Override
    public void stergeItem(Item item) throws Exception {
        items.remove(item);
    }

    @Override
    public void descriereItem() {
        System.out.println(nume);
        for (Item item : items) {
            item.descriereItem();
        }

    }

    @Override
    public Item getItem(int pozitie) throws Exception {
        return items.get(pozitie);
    }

    @Override
    public float calculeazaSumaGarantata(float pretPerLoc) {
        int suma = 0;
        for (Item item : items) {
            suma += item.calculeazaSumaGarantata(pretPerLoc);
        }
        return suma;
    }
}
