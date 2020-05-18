package FactoryMethod;

public class Client {

    private  CreateTransport creator;

    public Client(CreateTransport createTransport){
        this.creator = createTransport;
    }

    public Transport create(){
        return this.creator.createTransport();
    }

    public static void main(String args[]){
        CreateTruck createTruck = new CreateTruck();

        Client client = new Client(createTruck);

        Transport t = client.create();

        t.deliver();

        CreateShip createShip = new CreateShip();

        Client client2 = new Client(createShip);

        Transport t2 = client2.create();

        t2.deliver();


        CreatePlane createPlane = new CreatePlane();

        Client client3 = new Client(createPlane);

        Transport t3 = client3.create();

        t3.deliver();

    }
}
