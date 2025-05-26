package org.example.package1;

public class Calculator {
    protected double rezultat; // Variabila care stocheaza rezultatul calculului

    // Constructorul fara parametri seteaza rezultatul la 0
    public Calculator() {
        rezultat = 0;
    }

    // Constructorul cu un parametru permite setarea unui rezultat initial
    public Calculator(double x) {
        rezultat = x;
    }

    // Metoda pentru adunare. Returneaza obiectul curent pentru a permite chaining-ul metodelor
    public Calculator adunare(double x) {
        rezultat += x; // Adunam valoarea x la rezultat
        return this;   // Returnam obiectul curent pentru a continua operatiile
    }

    // Metoda pentru scadere. Returneaza obiectul curent pentru a permite chaining-ul metodelor
    public Calculator scadere(double x) {
        rezultat -= x; // Scadem valoarea x din rezultat
        return this;   // Returnam obiectul curent pentru a continua operatiile
    }

    // Metoda pentru inmultire. Returneaza obiectul curent pentru a permite chaining-ul metodelor
    public Calculator inmultire(double x) {
        rezultat *= x; // Inmultim rezultatul cu x
        return this;   // Returnam obiectul curent pentru a continua operatiile
    }

    // Metoda pentru impartire. Verifica daca x este diferit de 0 si returneaza obiectul curent pentru chaining
    public Calculator impartire(double x) {
        if(x == 0){
            throw new RuntimeException("Nu se poate imparti la 0!"); // Arunca o exceptie daca se incearca impartirea la 0
        }
        rezultat /= x; // Impartim rezultatul la x
        return this;   // Returnam obiectul curent pentru a continua operatiile
    }

    // Metoda care returneaza rezultatul final al calculelor
    public double getRezultat() {
        return rezultat; // Returneaza rezultatul calculului
    }
}