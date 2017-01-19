package fr.mazerty.shika.torii.session;

import fr.mazerty.shika.torii.bean.User;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class Session implements Serializable {

    private User loggedUser;

    public boolean isLoggedIn() {
        return loggedUser != null;
    }

    public void logOut() {
        loggedUser = null;
    }

    public void login(User user) {
        loggedUser = user;
    }

}
