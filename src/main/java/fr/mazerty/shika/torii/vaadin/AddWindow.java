package fr.mazerty.shika.torii.vaadin;

import com.vaadin.ui.FormLayout;
import fr.mazerty.shika.ishi.vaadin.MyBeanFieldGroup;
import fr.mazerty.shika.ishi.vaadin.MyButton;
import fr.mazerty.shika.ishi.vaadin.MyTextField;
import fr.mazerty.shika.ishi.vaadin.MyWindow;
import fr.mazerty.shika.torii.bean.User;

import javax.annotation.PostConstruct;

public class AddWindow extends MyWindow {

    private MyBeanFieldGroup<User> bfg;
    private MyTextField email;

    @PostConstruct
    public void postConstruct() {
        // TODO i18n when moved to admin view
        setCaption("Add user");

        bfg = new MyBeanFieldGroup<>(User.class);

        email = bfg.buildAndBind("Email", "email", MyTextField.class);

        MyButton add = new MyButton("Add").withPrimary();
        add.addClickListener(event -> close());

        FormLayout formLayout = new FormLayout(email, add);
        formLayout.setSizeUndefined();
        formLayout.setMargin(true);

        setContent(formLayout);
        setModal(true);
        setResizable(false);
    }

    @Override
    protected void enter() {
        bfg.setBean(new User());
        email.focus();
    }

}
