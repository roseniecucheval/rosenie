package spring.beans;

import spring.interfaces.Instrument;
import spring.interfaces.Musicien;

public class Pianiste implements Musicien {

    private Instrument instrument;

    public Pianiste() {
        
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Le pianiste joue : ");
        instrument.jouer();
    }

}
