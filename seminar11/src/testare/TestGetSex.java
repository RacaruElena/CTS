package testare;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetSex {
    @Test
    public void testRightSexF() {
        Persoana persoana = new Persoana("Ana", "2990309284541");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testRightSexM() {
        Persoana persoana = new Persoana("Ion", "382309284541");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBounderySexInferior() {
        Persoana persoana = new Persoana("Ion", "10001012123565");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBounderySexSuperior() {
        Persoana persoana = new Persoana("Ana", "62201012123565");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheckSex() {
        Persoana persoana = new Persoana("Ana", "52201012123565");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra % 2 != 0 ? "M" : "F", persoana.getSex());
    }

    @Test(expected = CnpIncorect.class)
    public void testErrorSex() {
        Persoana persoana = new Persoana("Ana", "02201012123565");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformanceSex() {
        Persoana persoana = new Persoana("Ana", "62201012123565");
        persoana.getSex();
    }

    @Test
    public void testFormatSex() {
        Persoana persoana = new Persoana("Ana", "62201012123565");
        assertEquals(1, persoana.getSex().length());

    }

    @Test(expected = NullPointerException.class)
    public void testExistenceSex() {
        Persoana persoana = new Persoana("Ana", null);
        persoana.getSex();

    }

}