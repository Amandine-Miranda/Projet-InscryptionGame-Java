package jeu;

import java.util.Scanner;

public class ControleurJeu {
    private Scanner m_scanner;

    public ControleurJeu() {
        m_scanner = new Scanner(System.in);
    }

    public void executerCommande(Commande commande) {
        switch (commande.getType()) {
            case PIOCHER:
                // action pour piocher
                System.out.println("Je pioche !");
            case PLACER:
                //action pour placer une carte
                System.out.println("Je place une carte sur le terrain !");
            case FIN:
                //action pour finir son tour
                System.out.println("Je termine mon tour !");
            default:
                System.out.println("Vide");
        }
    }

    public Commande lireCommande() {
        String saisie = m_scanner.nextLine();
        switch(saisie.toLowerCase()) {
            case "placer":
                return new Commande(TypeCommande.PLACER);
            case "piocher":
                return new Commande(TypeCommande.PIOCHER);
            case "fin":
                return new Commande(TypeCommande.FIN);
            default:
                return null;
        }
    }
}
