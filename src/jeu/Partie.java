package jeu;

import cartes.CarteAnimal;

import java.util.ArrayList;

public class Partie {
    private int m_numeroPartie;
    private int m_numeroTour;
    private int m_score;
    private Plateau m_plateau;
    private Pioche m_pioche;
    private JoueurHumain m_joueur;
    private IA m_adversaire;
    private ArrayList<String> m_historiqueDegats;

    public Partie(int numPartie, int numTour, int score, Plateau plateau, Pioche pioche, JoueurHumain joueur, IA adversaire, ArrayList<String> histoDegats) {
        m_numeroPartie = numPartie;
        m_numeroTour = numTour;
        m_score = score;
        m_plateau = plateau;
        m_pioche = pioche;
        m_joueur = joueur;
        m_adversaire = adversaire;
        m_historiqueDegats = histoDegats;
    }

    public void initialiser() {
        System.out.println("J'initialise une partie");
    }

    public void jouerTourJoueur() {
        System.out.println("C'est le tour du joueur.");
    }

    public void jouerTourIA() {
        System.out.println("C'est le tour de l'IA.");
    }

    public void resoudreAttaque() {
        System.out.println("Résoudre les attaques");
    }

    public void mettreAJourScore(int valeur) {
        System.out.println("Score mis à jour. Nouveau score : " + valeur);
    }

    public boolean verifierFinPartie() {
        return false; //faire en sorte de vérifier la victoire
    }

    public void ajouterCarteRecompense(CarteAnimal carte) {
        System.out.println(carte.getNom());
    }

}
