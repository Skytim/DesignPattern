package tim.tsai.created.simplefactory.factory;

import tim.tsai.created.simplefactory.buttons.Button;
import tim.tsai.created.simplefactory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}