package fr.mazerty.shika.torii.vaadin;

import com.vaadin.cdi.CDIView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import fr.mazerty.shika.ishi.vaadin.MyGrid;
import fr.mazerty.shika.ishi.vaadin.MyView;
import fr.mazerty.shika.torii.bean.User;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Special view for the application's administration. Logged user needs to be administrator to access it.
 */
@CDIView(AdminView.VIEW_NAME)
public class AdminView extends MyView {

    static final String VIEW_NAME = "admin";

    @Inject
    private AddWindow addWindow;

    @PostConstruct
    public void postConstruct() {
        setSizeFull();
        setMargin(true);
        setSpacing(true);

        // TODO : i18n when moved to admin view
        Button add = new Button("Add");
        add.addClickListener(event -> show(addWindow));

        MyGrid grid = new MyGrid<>(User.class);
        grid.setSizeFull();

        addComponents(add, grid);
        setComponentAlignment(add, Alignment.MIDDLE_RIGHT);
        setExpandRatio(grid, 1);
    }

}
