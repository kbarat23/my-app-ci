package com.example;

/**
 * Classe principale de l'application.
 */
public class App {

    private App() {
        // Constructeur privé pour éviter l’instanciation de la classe utilitaire
    }

    /**
     * Point d'entrée du programme.
     * @param args les arguments de ligne de commande
     */
    public static void main(final String[] args) {
        final int a = 2;
        final int b = 3;
        System.out.println(somme(a, b));
    }

    /**
     * Additionne deux entiers.
     * @param a premier entier
     * @param b deuxième entier
     * @return la somme de a et b
     */
    public static int somme(final int a, final int b) {
        return a + b;
    }
}
