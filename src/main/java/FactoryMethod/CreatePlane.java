package FactoryMethod;

public class CreatePlane extends CreateTransport {



    public CreatePlane(){

    }

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
