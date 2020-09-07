package ir.seefa.tutorial.spring.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 16:43:41
 */
@Service("TelegramService")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
public class TelegramServiceImpl implements MessageService {

    private String destination;
    private String text;

    public TelegramServiceImpl() {
        System.out.println("1.7. TelegramServiceImpl constructor called.");
    }

    private String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void send(String msg) {
        System.out.println("4.3. Telegram Service called and message is: " + msg + " destination: " + getDestination());
    }
}
