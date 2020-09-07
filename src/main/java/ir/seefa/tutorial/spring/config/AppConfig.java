package ir.seefa.tutorial.spring.config;

import org.springframework.context.annotation.*;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:17:15
 */
// 1. define class as Spring Config pure Java-based Annotation solution
@Configuration
// 2. detect bean classes with @ComponentScan annotation solution
@ComponentScan(basePackages = {"ir.seefa.tutorial.spring.bean", "ir.seefa.tutorial.spring.service"})
// 3. import extra config file from extra config file
@Import(value = {ExtraConfig.class})
// 4. import extra config file from XML-based config file
@ImportResource(locations = {"classpath:/application-context.xml"})
// 5. add application configuration to .properties file in classpath or externalizing configuration file(OS path/to/file)
@PropertySource(value = "application.properties", ignoreResourceNotFound = true)
public class AppConfig {
}
