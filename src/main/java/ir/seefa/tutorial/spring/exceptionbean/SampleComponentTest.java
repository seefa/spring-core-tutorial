package ir.seefa.tutorial.spring.exceptionbean;

import ir.seefa.tutorial.spring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:19:08
 */
@Component
public class SampleComponentTest {


    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    // 1. autowire a bean which has tow implementations and raise exception during getBean process
    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
