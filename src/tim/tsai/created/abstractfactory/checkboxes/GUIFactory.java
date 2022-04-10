package tim.tsai.created.abstractfactory.checkboxes;

import tim.tsai.created.abstractfactory.buttons.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
