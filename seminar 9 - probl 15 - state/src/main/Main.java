package main;

import clase.Autobuz;
import clase.LaCapatDeLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(3);

        autobuz.trimiteInService();
        autobuz.pleacaInCursa();
        autobuz.iesireDinService();
        autobuz.pleacaInCursa();
        autobuz.trimiteInService();
        //autobuz.setStare(new LaCapatDeLinie()); am facut setter-ul protected
        autobuz.ajungeLaCapatDeLinie();
    }
}
