package spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.interfaces.Instrument;
import spring.interfaces.Musicien;

@Component
public class Guitariste implements Musicien {

    @Autowired
    @Qualifier("guitare")
    private Instrument instrument;

    public Guitariste() {
        
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Le guitariste joue : ");
        instrument.jouer();
    }

}
