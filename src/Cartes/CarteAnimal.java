package Cartes;

public class CarteAnimal extends Carte{
    private int m_attaque;
    private int m_coutSang;
    private int m_coutOs;
    private boolean m_estVolant;

    public CarteAnimal(String nom, int pv, int attak, int coutSang, int coutOs, boolean vole){
        super(nom, pv);
        m_attaque = attak;
        m_coutOs = coutOs;
        m_coutSang = coutSang;
        m_estVolant = vole;
    }

    public int attaquer(Carte cible){
        cible.subirDegats(m_attaque);
        return cible.getPV();
    }

    public boolean attaqueDirecte(){
        return m_estVolant;
    }

    public int getAttaque(){
        return m_attaque;
    }

    public int getCoutSang(){
        return m_coutSang;
    }

    public int getCoutOs(){
        return m_coutOs;
    }

    public boolean estVolant(){
        return m_estVolant;
    }
}
