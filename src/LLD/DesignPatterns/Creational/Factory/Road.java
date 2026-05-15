package LLD.DesignPatterns.Creational.Factory;

class Road implements Logistics {
    @Override
    public void send() {

        System.out.println("Sending by road logic");
    }
}