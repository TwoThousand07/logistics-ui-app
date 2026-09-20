package assignment2.app;

import assignment2.factory.GUIFactory;
import assignment2.logistics.Logistics;
import assignment2.products.Button;
import assignment2.products.Checkbox;

public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory factory, Logistics logistics) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.logistics = logistics;
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }

    public void executeDelivery(String cargo, String destination) {
        logistics.planDelivery(cargo, destination);
    }
}
