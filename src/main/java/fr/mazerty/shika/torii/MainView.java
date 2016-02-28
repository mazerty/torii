package fr.mazerty.shika.torii;

import com.vaadin.cdi.CDIView;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import fr.mazerty.shika.ishi.MyUI;
import fr.mazerty.shika.ishi.MyView;

import static com.vaadin.ui.Alignment.MIDDLE_CENTER;

@CDIView(MyUI.MAIN_VIEW_NAME)
public class MainView extends MyView {

    public MainView() {
        Panel panel = new Panel(new Label("ok"));
        panel.setSizeUndefined();

        setSizeFull();
        addComponent(panel);
        setComponentAlignment(panel, MIDDLE_CENTER);
    }

}
