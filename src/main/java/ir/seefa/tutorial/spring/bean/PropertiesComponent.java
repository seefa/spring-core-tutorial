package ir.seefa.tutorial.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 07 Sep 2020 T 02:14:58
 */
@Component
public class PropertiesComponent {
    // 1. using Spring SpEL to load Spring value from configuration file
    @Value("${app.name:NO_APP_NAME}")
    private String applicationName;
    @Value("${app.version:NO_VERSION}")
    private String applicationVersion;
    @Value("${app.build.number:1}")
    private String applicationBuildNumber;
    @Value("#{${app.build.number:1} matches '\\d+'}")
    private boolean validDigit;
    @Value("#{new java.text.SimpleDateFormat(\"yyyy/MM/dd\").parse(\"${app.build.date:2020/02/02}\")}")
    private Date applicationDate;

    @Override
    public String toString() {
        return "13. PropertiesComponent{" +
                "applicationName='" + applicationName + '\'' +
                ", applicationVersion='" + applicationVersion + '\'' +
                ", validDigit=" + validDigit +
                ", applicationBuildNumber=" + applicationBuildNumber +
                ", applicationDate=" + applicationDate +
                '}';
    }
}
