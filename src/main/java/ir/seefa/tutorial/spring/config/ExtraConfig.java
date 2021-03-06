package ir.seefa.tutorial.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 23:08:21
 */
@Configuration
@ComponentScan(basePackages = {"ir.seefa.tutorial.spring.extrabean"})
public class ExtraConfig {
}
