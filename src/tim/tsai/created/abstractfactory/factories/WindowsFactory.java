package tim.tsai.created.abstractfactory.factories;

import tim.tsai.created.abstractfactory.buttons.Button;
import tim.tsai.created.abstractfactory.buttons.WindowsButton;
import tim.tsai.created.abstractfactory.checkboxes.Checkbox;
import tim.tsai.created.abstractfactory.checkboxes.GUIFactory;
import tim.tsai.created.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
