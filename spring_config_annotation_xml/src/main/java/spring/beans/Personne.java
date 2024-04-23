package spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Olivier")
public class Personne {

    private String nom = "Olivier";
    @Autowired
    private Adresse adresse;

    // Indispensable pour Spring
    public Personne() {

    }

    public void bonjour() {
        System.out.println("Je suis une personne.");
    }

    public String getNom() {
        return nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}