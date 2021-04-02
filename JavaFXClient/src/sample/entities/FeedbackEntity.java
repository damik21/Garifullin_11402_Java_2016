package sample.entities;


/**
 * Created by Damir on 10.05.2016.
 */
public class FeedbackEntity {

    private Integer id;

    private ClientEntity client;

    private String message;

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
