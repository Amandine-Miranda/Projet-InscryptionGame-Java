package jeu;

import cartes.Carte;
import cartes.CarteAnimal;

import java.util.ArrayList;
import java.util.Scanner;

public class IA {
    private ArrayList<CarteAnimal> m_cartesAnnoncees;

    public IA(ArrayList<CarteAnimal> listeIA) {
        m_cartesAnnoncees = listeIA;
    }

    public CarteAnimal choisirCarteAJouer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez la carte que vous voulez jouer (entre 0 et " + m_cartesAnnoncees.size() + "");
        int carte = sc.nextInt();
        return m_cartesAnnoncees.get(carte);
    }
}
