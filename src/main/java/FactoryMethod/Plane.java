package FactoryMethod;

public class Plane implements Transport {

    public Plane(){

    }

    @Override
    public void deliver() {
        System.out.println("deliver by air in a container");
    }

}
