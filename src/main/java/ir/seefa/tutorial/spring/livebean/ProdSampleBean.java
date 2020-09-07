package ir.seefa.tutorial.spring.livebean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:19:08
 */
@Component
@Profile("prod")
public class ProdSampleBean {

    public ProdSampleBean() {
        System.out.println("1.12. ProductionSampleBean constructor called.");
    }
}
