package ridesharing;

import java.util.List;
import java.util.Locale;
import java.util.Map;

class Location{
    int lon,lat;
}
interface Vehicle {
    String vehicleType();
    Location getLocation();
}

class Car implements Vehicle {
    Driver driver;
    Location location;
    Fare fare;
    @Override
    public String vehicleType() {
        return "CAR";
    }

    @Override
    public Location getLocation() {
        return null;
    }

    public double getFare(int kms,int dur){
       return fare.calculateFare(kms,dur);
    }
}

class Driver {
    String name;
    int age;
}

interface Fare{
    double calculateFare(int distanceTravelled,long tripDurationInMinutes);
}
class CarFare implements Fare{

    @Override
    public double calculateFare(int distanceTravelled, long tripDurationInMinutes) {
        System.out.println("Calculating fare for Car.");
        return 0;
    }
}

class VehicleFinderService{
   private List<Vehicle> avialableCars;
   void registerVehicle(Vehicle vehicle){
       avialableCars.add(vehicle);
   }
   Vehicle getVehicle(Location loc,String type){
       // fetch from the available vehhicles
       return null;
   }
}

class VehicleBookingService{
    protected Map<User,Vehicle> currentBookings;
    protected VehicleFinderService vehicleFinderService;
//    Vehicle bookVehichle(Location curLocation,User user, Vehicle requestedVehicle){
//      Vehicle vehicle=  vehicleFinderService.getVehicle(curLocation,user,requestedVehicle);
//    }
}
class User{
    String id;
    String name;
    String details;
}
