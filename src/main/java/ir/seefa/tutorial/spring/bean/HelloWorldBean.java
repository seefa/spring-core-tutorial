package ir.seefa.tutorial.spring.bean;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 06 Sep 2020 T 03:04:39
 */
public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
