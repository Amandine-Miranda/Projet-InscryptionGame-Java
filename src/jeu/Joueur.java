package jeu;

import cartes.*;

public class Joueur {
    private String m_nom;
    private Main m_main;
    private int m_os;
    private CarteAnimal m_carte;
    private Position position;

    public void piocher(Pioche pioche) {
        pioche.piocher();
    }

    public void jouerTour() {
        System.out.println("C'est à votre tour !");
    }

    //placerCarte

    //sacrifierCarte

    //peutJouerCarte

    //retirerCarteMain

    //ajouterOs
}
