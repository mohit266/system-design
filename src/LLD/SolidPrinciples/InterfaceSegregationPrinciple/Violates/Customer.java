package LLD.SolidPrinciples.InterfaceSegregationPrinciple.Violates;

class Customer implements UberUser {

    // Customer only needs to book the ride. and it forced to implement other two methods. So it violates the ISP.
    @Override
    public void bookRide() {
        System.out.println("Ride booked");
    }

    @Override
    public void driveVehicle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void acceptRide() {
        throw new UnsupportedOperationException();
    }
}