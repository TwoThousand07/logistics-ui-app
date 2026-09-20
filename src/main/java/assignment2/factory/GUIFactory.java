package assignment2.factory;

import assignment2.products.Button;
import assignment2.products.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
