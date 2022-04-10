package tim.tsai.created.abstractfactory.checkboxes;

import java.awt.*;

public class MacOSCheckbox  implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
