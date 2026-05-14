package LLD.InterfaceSegregationPrinciple;

public class Customer implements Rider {
    @Override
    public void bookRide() {
        System.out.println("Ride Booked");
    }
}
