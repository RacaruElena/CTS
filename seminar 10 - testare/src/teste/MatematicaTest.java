package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {
    private Matematica mate;

    @Before
    public void setup() {
        mate = Matematica.getInstance();
    }

    @Test
    public void testSumaCorecta() {

        int rezultatObtinut = mate.suma(7, 5);
        assertEquals(12, rezultatObtinut);
    }

    @Test
    public void testRaportCorect() {

        double rezultatObtinut = mate.raport(24, 6);
        assertEquals(4, rezultatObtinut, 0.001);

    }

    @Test
    public void testRaport2() {

        double rezultatObtinut = (double) mate.raport(24, 5);
        assertEquals(4.8, rezultatObtinut, 0.08);
    }

    @Test
    public void testRaport3() {

        double rezultatObtinut = (double) mate.raport(-24, 2);
        assertEquals(-12, rezultatObtinut, 0.08);
    }

    @Test
    public void testRaport4() {
        double rezultatObtinut = mate.raport(6, 6);
        assertEquals(1, rezultatObtinut, 0.01);

    }

    @Test
    public void testRaportShouldThrowException() {
        try {
            mate.raport(57, 0);
            fail("nu trebuia sa ajunga aici");
        } catch (IllegalArgumentException ert) {

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaportShouldThrowException2() {
        mate.raport(23, 0);
    }

    @Test
    public void testParitate() {
        boolean rezultat = mate.estePar(6);
        assertTrue(rezultat);
        assertFalse(mate.estePar(9));
        assertFalse(mate.estePar(11));
        assertTrue(mate.estePar(12));

    }

    @Test
    public void testLista() {
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(3, mate.nNumerePare(3).size());
        assertEquals(6, mate.nNumerePare(6).size());
    }

    @Test
    public void testListaNull() {
        assertNull(mate.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowException() {
        mate.nNumerePare(-3);

    }

    @Test
    public void testSingleton() {
        assertSame(Matematica.getInstance(), Matematica.getInstance());
    }


}