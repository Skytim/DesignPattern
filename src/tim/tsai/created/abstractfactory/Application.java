package tim.tsai.created.abstractfactory;

import tim.tsai.created.abstractfactory.buttons.Button;
import tim.tsai.created.abstractfactory.checkboxes.Checkbox;
import tim.tsai.created.abstractfactory.checkboxes.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
