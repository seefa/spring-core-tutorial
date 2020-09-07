package ir.seefa.tutorial.spring.config;

import ir.seefa.tutorial.spring.bean.HelloWorldBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 02:38:16
 */

@Configuration
public class ApplicationConfiguration {

    // 1. Define a bean class with Alias name over @Bean annotation in configuration class
    @Bean(name="helloWorldObject")
    public HelloWorldBean getHelloWorldBean(){
        return new HelloWorldBean("Hello Seefa !");
    }

    // 2. When we didn't define bean name; method name assigned for bean name
    @Bean
    public String getMyObject() {
        return "A String bean without bean name. method name will use for bean name";
    }

    // 3. define lazy bean
    @Bean
    @Lazy
    public String lazyObject() { return "Lazy Object"; }

    // 4. define prototype bean mode
    @Bean
    @Scope("prototype")
    public String prototypeObject() { return "Prototype Object"; }

}
