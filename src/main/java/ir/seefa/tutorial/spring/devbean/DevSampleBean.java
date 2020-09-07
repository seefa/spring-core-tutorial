package ir.seefa.tutorial.spring.devbean;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:19:08
 */
@Component
@Profile("dev")
public class DevSampleBean {

    public DevSampleBean() {
        System.out.println("1.12. DevSampleBean constructor called.");
    }
}
