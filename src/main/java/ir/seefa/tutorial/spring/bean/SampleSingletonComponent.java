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
// 1. default bean scope is Singleton bean scope
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SampleSingletonComponent {

    private String value;

    public SampleSingletonComponent() {
        System.out.println("1.4. SampleSingletonComponent constructor called.");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
