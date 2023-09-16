package aulaquatro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartasTests {

    private Cartas cartas;

    @BeforeEach
    void setUp() {
        cartas = new Cartas();
    }

    @Test
    @DisplayName("Testando a carta A")
    public void testCartaA() {
        assertEquals(1, cartas.converteCartaParaInt("A"));
        assertEquals(1, cartas.converteCartaParaInt("a"));
    }

    @Test
    @DisplayName("Testando a carta 2")
    public void testCarta2() {
        assertEquals(2, cartas.converteCartaParaInt("2"));
    }

    @Test
    @DisplayName("Testando a carta 4")
    public void testCarta4() {
        assertEquals(4, cartas.converteCartaParaInt("4"));
    }

    @Test
    @DisplayName("Testando a carta 5")
    public void testCarta5() {
        assertEquals(5, cartas.converteCartaParaInt("5"));
    }

    @Test
    @DisplayName("Testando a carta 6")
    public void testCarta6() {
        assertEquals(6, cartas.converteCartaParaInt("6"));
    }

    @Test
    @DisplayName("Testando a carta 7")
    public void testCarta7() {
        assertEquals(7, cartas.converteCartaParaInt("7"));
    }

    @Test
    @DisplayName("Testando a carta 8")
    public void testCarta8() {
        assertEquals(8, cartas.converteCartaParaInt("8"));
    }

    @Test
    @DisplayName("Testando a carta 9")
    public void testCarta9() {
        assertEquals(9, cartas.converteCartaParaInt("9"));
    }

    @Test
    @DisplayName("Testando a carta 10")
    public void testCarta10() {
        assertEquals(10, cartas.converteCartaParaInt("10"));
    }

    @Test
    @DisplayName("Testando a carta J")
    public void testCartaJ() {
        assertEquals(11, cartas.converteCartaParaInt("J"));
        assertEquals(11, cartas.converteCartaParaInt("j"));
    }

    @Test
    @DisplayName("Testando a carta Q")
    public void testCartaQ() {
        assertEquals(12, cartas.converteCartaParaInt("Q"));
        assertEquals(12, cartas.converteCartaParaInt("q"));
    }

    @Test
    @DisplayName("Testando a carta K")
    public void testCartaK() {
        assertEquals(13, cartas.converteCartaParaInt("K"));
        assertEquals(13, cartas.converteCartaParaInt("k"));
    }

    @Test
    @DisplayName("Testando a carta inexistente")
    public void testCartaInexistente() {
        assertEquals(-1, cartas.converteCartaParaInt("FK"));
    }
}
