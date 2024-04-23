package spring.beans;

import spring.interfaces.Instrument;

public class Piano implements Instrument {

    @Override
    public void jouer() {
        System.out.println("piano.");
    }

}
