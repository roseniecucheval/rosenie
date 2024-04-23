package spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Adresse {
    
    private String adresse = "Chez Olivier.";

    public Adresse() {

    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}