package jeu;

import cartes.Carte;

import java.util.ArrayList;

public class Plateau {
    private ArrayList<Emplacement> m_ligneAdverse;
    private ArrayList<Emplacement> m_ligneJoueur;
    private Carte m_carte;
    private Position m_position;

    public Plateau(ArrayList<Emplacement> ligneAdverse, ArrayList<Emplacement> ligneJoueur, Carte carte, Position position) {
        m_ligneAdverse = ligneAdverse;
        m_ligneJoueur = ligneJoueur;
        m_carte = carte;
        m_position = position;
    }

    public Carte getCarte(Position position) {
        return m_carte;
    }

    public boolean placerCarte() {
        return m_ligneJoueur.isEmpty();
    }

    public void retirerCarte(Position position) {
        System.out.println(position.toString());
    }

    public boolean emplacement(Position position) {
        return position == m_position;
    }

    public Carte carteEnFace() {
        return m_carte; // pas exactement ça
    }
}
