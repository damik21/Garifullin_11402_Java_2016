package sample.connection;

import sample.entities.Position;

import java.util.Base64;

/**
 * Created by Damir on 24.05.2016.
 */
public class ServerAuthentication {
    private static String loginPass;
    public static Position position;

    private ServerConnection server = new ServerConnection();

    static String getLoginPass() {
        return loginPass;
    }

    public boolean tryAuth(String login, String password) {
        save(login, password);

        try {
            Position position = server.getUserPosition();
            ServerAuthentication.position = position;
            System.out.println(position);
            return true;
        } catch (CustomException e) {
            System.out.println(e.getStatusCode());
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return false;
    }

    private void save(String login, String password) {
        byte[] bytes = (login + ":" + password).getBytes();
        loginPass = "Basic " + Base64.getEncoder().encodeToString(bytes);;
    }
}
