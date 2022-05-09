package flyweight_factory;

import clase.Linie;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer, Linie> linieMap;

    public FlyweightFactory() {
        linieMap = new HashMap<>();

    }

    public Linie getLinie(Integer nrLinie) {
        Linie linieDeReturnat = linieMap.get(nrLinie);
        if (linieDeReturnat != null) {
            return linieDeReturnat;
        } else {
            linieDeReturnat = new Linie(nrLinie, "Prima statie", "Ultima statie");
            linieMap.put(linieDeReturnat.getNrLinie(), linieDeReturnat);
            return linieDeReturnat;
        }
    }
}
