package spring.beans;

import spring.interfaces.Instrument;

public class Piano implements Instrument {

    public Piano() {
        
    }

    @Override
    public void jouer() {
        System.out.println("Piano");
    }

}
