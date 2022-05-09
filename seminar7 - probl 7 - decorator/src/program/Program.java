package program;

import clase.Decorator;
import clase.DecoratorAbstract;
import clase.Iimprimanta;
import clase.ImprimantaBilete;

public class Program {
    public static void main(String[] args) {
        Iimprimanta imprimanta = new ImprimantaBilete(5);
        imprimanta.printeazaBilet();
        DecoratorAbstract decorator = new Decorator(imprimanta, "Paste fericit!");
        decorator.printeazaBilet();
        decorator.printeazaMesaj();
    }
}
