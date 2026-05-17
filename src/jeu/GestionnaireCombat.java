package jeu;

import cartes.*;

public class GestionnaireCombat {
    private CarteAnimal m_attaquant;
    private Carte m_defenseur;

    public GestionnaireCombat(CarteAnimal animal, Carte defense) {
        m_attaquant = animal;
        m_defenseur = defense;
    }

    public int attaquer() {
        return m_defenseur.getPV() - m_attaquant.getAttaque();
    }

    public int attaquerDirectement() {
        return 1;
    }
}
