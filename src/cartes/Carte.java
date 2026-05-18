package cartes;

import jeu.Position;

public abstract class Carte {
    private String m_nom;
    private int m_pointsVie;
    private Position m_position;

    public Carte(String nom, int pv){
        m_nom = nom;
        m_pointsVie = pv;
    }

    public Carte(String nom, int pv, Position pos){
        m_nom = nom;
        m_pointsVie = pv;
        m_position = pos;
    }

    public Position getM_position() {
        return m_position;
    }

    public void subirDegats(int degats){
        m_pointsVie -= degats;

        if(m_pointsVie < 0) {
            m_pointsVie = 0;
        }
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
