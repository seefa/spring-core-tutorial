package ir.seefa.tutorial.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 23:08:21
 */
@Configuration
@ImportResource(locations = {"classpath:/application-context-prod.xml"})
@Profile("prod")
public class ProdEnvConfig {
}
