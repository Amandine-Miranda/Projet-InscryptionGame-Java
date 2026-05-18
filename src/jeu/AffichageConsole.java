package jeu;

public class AffichageConsole {
    private Plateau m_plateau;
    private Main m_main;

    public AffichageConsole(Plateau plateau, Main main) {
        m_plateau = plateau;
        m_main = main;
    }

    public void afficherPlateau() {

    }

    public void afficherMain() {

    }

    public void afficherScore(int score) {
        System.out.println("Le score actuel est de " + score + " points.");
    }

    public void afficherMessage(String message) {
        System.out.println(message);
    }
}
