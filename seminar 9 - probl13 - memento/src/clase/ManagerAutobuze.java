package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuze {
    private List<MementoAutobuz> mementoAutobuzList;

    public ManagerAutobuze() {
        mementoAutobuzList = new ArrayList<>();
    }

    public MementoAutobuz getMementoAutobuz(int index) {
        return mementoAutobuzList.get(index);

    }

    public void adaugaMemento(MementoAutobuz mementoAutobuz){
        mementoAutobuzList.add(mementoAutobuz);
    }
}
