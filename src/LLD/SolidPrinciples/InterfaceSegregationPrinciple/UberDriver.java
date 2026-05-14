package LLD.SolidPrinciples.InterfaceSegregationPrinciple;

public class UberDriver implements Driver {
    @Override
    public void driveVehicle() {
        System.out.println("Driving Vehicle");
    }

    @Override
    public void acceptRide() {
        System.out.println("Ride Accepted");
    }
}
