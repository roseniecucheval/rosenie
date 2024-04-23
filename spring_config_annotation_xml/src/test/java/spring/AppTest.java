package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.Personne;

public class AppTest {
    public static void main(String[] args) {
        
        // Lancement de Spring
        ClassPathXmlApplicationContext ctx = new
        ClassPathXmlApplicationContext("application-context.xml");

        // Demande d'un bean à Spring
        Personne personne = (Personne) ctx.getBean("Olivier");
        // Récupération d'un objet
        personne.bonjour();
        System.out.println("--------------------");
        personne = ctx.getBean("Olivier", Personne.class);
        personne.bonjour();
        System.out.println(personne.getNom());
        System.out.println(personne.getAdresse().getAdresse());

        // Fermeture de Spring
        ctx.close();
    }
}
