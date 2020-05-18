package FactoryMethod;

public class Ship implements Transport {

    public Ship(){

    }

    @Override
    public void deliver() {
        System.out.println("deliver by sea in a container");
    }

}
