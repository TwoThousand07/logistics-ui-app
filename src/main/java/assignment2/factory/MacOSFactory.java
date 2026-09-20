package assignment2.factory;

import assignment2.products.Button;
import assignment2.products.Checkbox;
import assignment2.products.MacOSButton;
import assignment2.products.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
