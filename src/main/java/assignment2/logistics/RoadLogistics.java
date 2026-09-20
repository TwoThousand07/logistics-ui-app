package assignment2.logistics;

import assignment2.products.Transport;
import assignment2.products.Truck;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
