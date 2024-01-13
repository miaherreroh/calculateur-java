package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir deux nombres
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        // Demande à l'utilisateur de choisir une opération
        System.out.println("Choisissez l'opération ( +, -, *, /)");
        char operateur = scanner.next().charAt(0);

        // Calcul en fonction de l'opération choisie
        double resultat;

        switch (operateur) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                // Gestion de la division par zéro
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                } else {
                    System.out.println("Erreur : Division par zéro.");
                    return;
                }
                break;
            default:
                System.out.println("Erreur : Opérateur non valide.");
                return;
        }

        // Affichage du résultat
        System.out.println("Le résultat du calcul est : " + resultat);

        // Fermeture du scanner
        scanner.close();    }
}
