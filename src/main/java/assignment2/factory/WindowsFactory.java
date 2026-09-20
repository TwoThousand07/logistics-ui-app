package assignment2.factory;

import assignment2.products.Button;
import assignment2.products.Checkbox;
import assignment2.products.WindowsButton;
import assignment2.products.WIndowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WIndowsCheckbox();
    }
}
