package spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.beans.Pianiste;
import spring.beans.Piano;
import spring.interfaces.Instrument;
import spring.interfaces.Musicien;

@Configuration
@ComponentScan("spring.beans")
public class SpringConfig {

    @Bean
    public Instrument piano() {
        return new Piano();
    }

    @Bean 
    public Musicien pianiste(@Qualifier("piano") Instrument instrument) {
        Pianiste pianiste = new Pianiste();
        pianiste.setInstrument(instrument);
        return pianiste;
    }
}
