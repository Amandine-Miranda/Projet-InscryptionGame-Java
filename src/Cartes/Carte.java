package Cartes;

public abstract class Carte {
    private String m_nom;
    private int m_pointsVie;

    public Carte(String nom, int pv){
        m_nom = nom;
        m_pointsVie = pv;
    }

    public void subirDegats(int degats){
        m_pointsVie =- degats;
    }

    public boolean estDetruite(){
        return m_pointsVie == 0;
    }

    public String getNom(){
        return m_nom;
    }

    public int getPV(){
        return m_pointsVie;
    }
}
