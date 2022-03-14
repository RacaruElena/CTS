package clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    private static int prag = 80;
    private String numeFisier;

    public static void setPrag(int prag) {
        Aplicant.prag = prag;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void afisareRezultat() {
        System.out.println("Aplicantul " + this.nume + " " +
                this.prenume + (punctaj > prag ? " " : " nu ") + " a fost acceptat.");
    }


    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }


    public void setNrproiecte(int nrProiecte, String[] denumireProiect) {
        this.nrProiecte = nrProiecte;
        this.denumireProiect = new String[this.nrProiecte];
        for (int i = 0; i < this.nrProiecte; i++) {
            this.denumireProiect[i] = denumireProiect[i];
        }
    }

    @Override
    public String toString() {
        return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
                + ", numar proiecte=" + nrProiecte + ", denumire proiect=" + Arrays.toString(denumireProiect) + "]";
    }

    public void afisareSumaBani(int sumaBani) {
        System.out.println(
                "Aplicantul " + getNume() + " " + getPrenume() + " primeste " + sumaBani + " Euro/zi in proiect.");
    }
}
