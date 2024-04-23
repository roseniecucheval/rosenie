package spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpectateurAspect {

    @Pointcut("execution(* spring.beans.*.perform())")
    public void musicienJoueInstrument() {

    }

    @Before("musicienJoueInstrument()")
    public void installationEtExtinction() {
        System.out.println("Les spectateurs s'installent et éteignent leur téléphone.");
    }
}
