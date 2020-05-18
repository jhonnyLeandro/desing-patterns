package FactoryMethod;

public class CreateShip extends CreateTransport {

    public CreateShip(){

    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
