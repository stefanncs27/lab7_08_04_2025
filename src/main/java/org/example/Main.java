package org.example;

import org.example.package1.Calculator;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Calculator(7)
                .adunare(5)
                .scadere(2)
                .inmultire(3)
                .impartire(2)
                .getRezultat());
    }
}
