package spring.beans;

import org.springframework.stereotype.Component;

import spring.interfaces.Instrument;

@Component
public class Guitare implements Instrument {

    @Override
    public void jouer() {
        System.out.println("guitare.");
    }

}
