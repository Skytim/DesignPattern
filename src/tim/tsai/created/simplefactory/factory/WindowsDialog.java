package tim.tsai.created.simplefactory.factory;

import tim.tsai.created.simplefactory.buttons.Button;
import tim.tsai.created.simplefactory.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
