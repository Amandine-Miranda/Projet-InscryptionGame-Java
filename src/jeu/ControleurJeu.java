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
                piocher();
            case PLACER:
                placer():
            case FIN:
                fin():
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
