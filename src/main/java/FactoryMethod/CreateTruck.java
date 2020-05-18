package FactoryMethod;

public class CreateTruck extends CreateTransport {

    public CreateTruck(){

    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
