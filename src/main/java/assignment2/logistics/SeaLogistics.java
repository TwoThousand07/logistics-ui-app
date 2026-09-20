package assignment2.logistics;

import assignment2.products.Ship;
import assignment2.products.Transport;


public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new assignment2.products.Ship();
    }
}
