package jeu;

import cartes.Carte;

public class Emplacement {
    private Position m_position;
    private Carte m_carte;

    public boolean estLibre() {
        return m_position.equals(m_carte.getM_position());
    }

    public void placerCarte() {
        if(estLibre()) {
            System.out.println("Je place une carte"); //faire en sorte de placer une carte sur une case
        }
        else {
            System.out.println("Vous ne pouvez pas placer une carte");
        }
    }

    public void retirerCarte() {

    }

    public Carte getCarte() {
        return m_carte;
    }
}
