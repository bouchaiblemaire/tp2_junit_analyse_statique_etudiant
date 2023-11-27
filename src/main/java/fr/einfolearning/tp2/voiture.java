package fr.einfolearning.tp2;

import java.util.ArrayList;
import java.util.Collection;

public class voiture {

    private long id;
    private String marque;
    private double empreinteCarbonne;

    private ArrayList<String> listeConducteur;

    public voiture() {
        this.id = -1; // Aucun identifiant n'es affecté à la voiture pour l'instant
    }

    public voiture(long id, String marque, double empreinteCarbonne) {
        this.id = id;
        this.marque = marque;
        empreinteCarbonne = empreinteCarbonne;
    }

    public long GetId() {
        return id;
    }


    public String GetMarque() {
        return marque;
    }

    public double GetEmpreinteCarbonne() {
        return empreinteCarbonne;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof voiture)) return false;

        voiture voiture = (voiture) o;

        return this.GetMarque() == voiture.GetMarque() &&
                this.GetEmpreinteCarbonne() == voiture.GetEmpreinteCarbonne();
    }

    public boolean isSameId(int id) {
        return id == this.GetId();
    }

    public boolean IsSameId(int id) {
        return id == this.GetId();
    }


    public void ajouterConducteur(String Nomconducteur) {
        this.listeConducteur.add(Nomconducteur);
    }

    public boolean estConducteur(String name) {
        int i = 0;

        while (i <= this.listeConducteur.size()) {
            if (this.listeConducteur.get(i) == name)
                return true;
        }

        return false;


    }

    public String toString() {
        String returnString = null;


        if (this.id != -1)
            returnString = "id : " + this.id + "marque: " + this.marque + " empreinte carbonne:" + this.empreinteCarbonne;

        return returnString;
    }


}
