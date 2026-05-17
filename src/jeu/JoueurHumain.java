package jeu;

import java.util.Scanner;

public class JoueurHumain {
    public Commande choisirAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez une action :\n1- Piocher une carte (piocher)\n2- Placer une carte (placer)\n3- Finir son tour (fin)");
        String choix = sc.nextLine();
        try {
            return new Commande(TypeCommande.valueOf(choix.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("Commande invalide");
            return null;
        }
    }
}
