package ir.seefa.tutorial.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:19:08
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// 1. second solution to define prototype bean scope
//@Scope("prototype")
public class SamplePrototypeComponent {

    private String value;

    public SamplePrototypeComponent() {
        System.out.println("1.6. SamplePrototypeComponent constructor called.");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
