package jeu;

import java.util.ArrayList;

public class Commande {
    private TypeCommande m_type;
    private ArrayList<String> m_arguments;

    public Commande(TypeCommande type){
        m_type = type;
        m_arguments = new ArrayList<String>();
    }

    public TypeCommande getType() {
        return m_type;
    }

    public ArrayList<String> getArguments() {
        return m_arguments;
    }

    public boolean equals(Object other) {
        if(other == null || other.getClass() != getClass()) {
            return false;
        }
        else {
            Commande test = (Commande) other;
            return m_type == test.m_type;
        }
    }
}
