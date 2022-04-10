package tim.tsai.created.abstractfactory.factories;

import tim.tsai.created.abstractfactory.buttons.Button;
import tim.tsai.created.abstractfactory.buttons.MacOSButton;
import tim.tsai.created.abstractfactory.checkboxes.Checkbox;
import tim.tsai.created.abstractfactory.checkboxes.GUIFactory;
import tim.tsai.created.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
