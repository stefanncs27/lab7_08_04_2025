package org.example;

import org.example.package1.Calculator;

public class Main {
    public static void main(String[] args) {

        // Cream un obiect Calculator cu valoarea initiala 7
        System.out.println(new Calculator(7)
                .adunare(5)       // Adunam 5 la rezultat
                .scadere(2)       // Scadem 2 din rezultat
                .inmultire(3)     // Inmultim rezultatul cu 3
                .impartire(2)     // Impartim rezultatul la 2
                .getRezultat());  // Afisam rezultatul final
    }
}