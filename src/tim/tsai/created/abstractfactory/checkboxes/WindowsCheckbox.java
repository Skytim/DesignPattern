package tim.tsai.created.abstractfactory.checkboxes;

import tim.tsai.created.abstractfactory.buttons.Button;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
