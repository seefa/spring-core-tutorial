package ir.seefa.tutorial.spring.extrabean;

import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:19:08
 */
@Component
public class SampleExtraBean {

    public SampleExtraBean() {
        System.out.println("1.10. SampleExtraBean constructor called from Extra Spring config file which imported in config class.");
    }

}
