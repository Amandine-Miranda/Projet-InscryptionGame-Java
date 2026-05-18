import cartes.*;
import jeu.*;

import java.util.ArrayList;

public class TestClasse {

    public static void main(String[] args) {
        ArrayList<Carte> cartes = new ArrayList<>();

        cartes.add(new Chat());
        cartes.add(new Loup());

        Pioche pioche = new Pioche(cartes);

        Carte cartePiochee = pioche.piocher();

        System.out.println(cartePiochee.getNom());

        cartePiochee = pioche.piocher();

        System.out.println(cartePiochee.getNom());
    }
}