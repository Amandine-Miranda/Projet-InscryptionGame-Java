package jeu;

import cartes.Carte;

import java.util.ArrayList;

public class Main {
    private ArrayList<Carte> m_cartes;

    public void ajouterCarte(Carte carte) {
        m_cartes.add(carte); //ajouter vérification
    }

    public void retirerCarte(Carte carte) {
        m_cartes.remove(carte); //ajouter vérification
    }

    public Carte getCarte(int index) {
        if(index < 0 || index >= m_cartes.size()) {
            System.out.println("L'index donné n'est pas valide.");
            return null;
        }
        return m_cartes.get(index);
    }

    public boolean contient(Carte carte) {
        return m_cartes.contains(carte);
    }

    public int taille() {
        return m_cartes.size();
    }
}
