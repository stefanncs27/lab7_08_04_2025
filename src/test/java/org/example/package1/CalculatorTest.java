package org.example.package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Test pentru metoda adunare
    @Test
    void adunare() {
        Calculator calculator = new Calculator();
        calculator.rezultat = 2;
        calculator.adunare(5); // Adunam 5
        assertEquals(7, calculator.getRezultat()); // Verificam daca rezultatul este 7
    }

    // Test pentru metoda scadere
    @Test
    void scadere() {
        Calculator calculator = new Calculator();
        calculator.rezultat = 15;
        calculator.scadere(5); // Scadem 5
        assertEquals(10, calculator.getRezultat()); // Verificam daca rezultatul este 10
    }

    // Test pentru metoda inmultire
    @Test
    void inmultire() {
        Calculator calculator = new Calculator();
        calculator.rezultat = 6;
        calculator.inmultire(5); // Inmultim cu 5
        assertEquals(30, calculator.getRezultat()); // Verificam daca rezultatul este 30
    }

    // Test pentru metoda impartire
    @Test
    void impartire() {
        Calculator calculator = new Calculator();
        calculator.rezultat = 14;
        calculator.impartire(5); // Impartim la 5
        assertEquals(2.8, calculator.getRezultat()); // Verificam daca rezultatul este 2.8
    }
}