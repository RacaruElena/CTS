package testare;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetVarsta {

    @Test
    public void testRightVarsta() {
        Persoana persoana = new Persoana("Ion", "6001222123456");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void testBounderyVarstaInferior() {
        Persoana persoana = new Persoana("Ion", "3000222123456");
        assertEquals(222, persoana.getVarsta());
    }

    @Test
    public void testBounderyVarstaSuperior() {
        Persoana persoana = new Persoana("Ana", "6220222123456");
        assertEquals(0, persoana.getVarsta());
    }

    @Test(expected = CnpIncorect.class)
    public void testErrorVarsta() {
        Persoana persoana = new Persoana("Ana", "6230222123456");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void testPerformance() {
        Persoana persoana = new Persoana("Ana", "6220222123456");
        persoana.getVarsta();
    }

    @Test
    public void testOrderVarsta() {
        Persoana persoana1 = new Persoana("Maria", "6000222123456");
        Persoana persoana2 = new Persoana("Ana", "2990309284541");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceVarsta() {
        Persoana persoana = new Persoana("Maria", null);
        persoana.getVarsta();

    }
}