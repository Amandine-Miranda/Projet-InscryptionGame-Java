package jeu;

import cartes.*;

import java.util.ArrayList;

public class Pioche {
    private ArrayList<Carte> m_cartes;

    public Pioche(ArrayList<Carte> listeCartes) {
        m_cartes = listeCartes;
    }

    public Carte piocher() {
        if(m_cartes.isEmpty()) {
            return null;
        }

        return m_cartes.removeFirst();
    }

    public void ajouterCarte(Carte carteChoisie){
        m_cartes.add(carteChoisie);
    }
}
