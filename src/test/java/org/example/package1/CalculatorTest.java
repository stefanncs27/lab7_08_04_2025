package org.example.package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void adunare() {
        Calculator calculator = new Calculator();
        calculator.rezultat=2;
        calculator.adunare(5);
        assertEquals(7,calculator.getRezultat());
    }

    @Test
    void scadere() {
        Calculator calculator = new Calculator();
        calculator.rezultat=15;
        calculator.scadere(5);
        assertEquals(10,calculator.getRezultat());
    }

    @Test
    void inmultire() {
        Calculator calculator = new Calculator();
        calculator.rezultat=6;
        calculator.inmultire(5);
        assertEquals(30,calculator.getRezultat());
    }

    @Test
    void impartire() {
        Calculator calculator = new Calculator();
        calculator.rezultat=14;
        calculator.impartire(5);
        assertEquals(2.8,calculator.getRezultat());
    }
}