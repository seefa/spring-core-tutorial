package ir.seefa.tutorial.spring.bean;

import ir.seefa.tutorial.spring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:19:08
 */
@Component
@Lazy
public class SampleLazyComponent {

    public SampleLazyComponent() {
        System.out.println("1.3. SampleLazyComponent constructor called.");
    }

    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    // 1. use @Autowired to wire between beans(SampleComponent and MessageService)
    // 2. use @Qualifier when we have more than one implementation from a bean interface
    @Autowired
    @Qualifier("TelegramService")
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
