package ir.seefa.tutorial.spring;

import ir.seefa.tutorial.spring.bean.*;
import ir.seefa.tutorial.spring.config.*;
import ir.seefa.tutorial.spring.service.MessageService;
import ir.seefa.tutorial.spring.service.TelegramServiceImpl;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 03:06:03
 */
public class MyApplication {

    public static void main(String[] args) {
        // 1. application context used to access Spring IoC Container
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class, AppConfig.class);


        // 2. access to bean with its custom name
        HelloWorldBean bean = (HelloWorldBean) context.getBean("helloWorldObject");
        String message = bean.getMessage();
        System.out.println("2. " + message);

        // 3. access to bean with its default name(method name will use when bean doesn't have a name)
        String beanWithDefaultMethodName = (String) context.getBean("getMyObject");
        System.out.println("3. " + beanWithDefaultMethodName);

        // 4. access to non-exist bean to catch Spring runtime exception
        try {
            context.getBean("getObject");
        } catch (NoSuchBeanDefinitionException e) {
            System.out.println("4. NoSuchBeanDefinitionException is raised. Because getObject is not valid bean name");
        }

        // 5. access to bean scanned by @ComponentScan and declared by @Qualifier
        SampleComponent component = (SampleComponent) context.getBean("sampleComponent");
        MessageService messageService = component.getMessageService();
        messageService.send("Hello Seefa world from SMS Service");

        // 5. access tow beans with two implementation and handle Spring runtime unchecked exception
        try {
            @SuppressWarnings("checked")
            ApplicationContext contextExp = new AnnotationConfigApplicationContext(AppConfigExp.class);
        } catch (Exception e) {
            System.out.println("5. Loading two bean implemented from one interface without unique @Qualifier is not possible");
        }

        // 6. access to lazy bean without Spring bean alias name and its casting
        SampleLazyComponent lazyComponent = context.getBean(SampleLazyComponent.class);
        System.out.println("6. lazy component in its lazy autowired bean(Telegram Service) called...");
        TelegramServiceImpl telegramService = (TelegramServiceImpl) lazyComponent.getMessageService();
        telegramService.setDestination("Saman Delfani");
        telegramService.send("Hello Seefa world from Telegram service");


        // 7. call Singleton bean two times to show Singleton scope mode
        SampleSingletonComponent singletonComponent = context.getBean(SampleSingletonComponent.class);
        singletonComponent.setValue("Saman Delfani");
        System.out.println("7.1 Singleton value = " + singletonComponent.getValue());

        SampleSingletonComponent singletonComponent2 = context.getBean(SampleSingletonComponent.class);
        System.out.println("7.2 Singleton value = " + singletonComponent2.getValue());

        // 8. call Prototype bean two times to show Prototype scope mode
        SamplePrototypeComponent prototypeComponent = context.getBean(SamplePrototypeComponent.class);
        prototypeComponent.setValue("Saman Delfani");
        System.out.println("8.1 Prototype value = " + prototypeComponent.getValue());

        SamplePrototypeComponent prototypeComponent2 = context.getBean(SamplePrototypeComponent.class);
        System.out.println("8.2 Prototype value = " + prototypeComponent2.getValue());

        // 9. call @PostConstructor and @PreDestroy methods during bean initialization and destroy
        SampleBean sampleBean = context.getBean(SampleBean.class);

        // 12. enable active profile in Spring context
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        annotationContext.getEnvironment().setActiveProfiles("dev");
        annotationContext.register(ProdEnvConfig.class, DevEnvConfig.class);
        annotationContext.refresh();
        annotationContext.close();

        // 13. loading application.properties parameters
        PropertiesComponent propertiesComponent = context.getBean(PropertiesComponent.class);
        System.out.println(propertiesComponent.toString());

    }
}
