package assignment2.DataCoupling;

import java.util.ArrayList;
import java.util.List;

public class CarReservationService {
    List<Car> lisofcars = new ArrayList<>();

    public boolean IsCarAvailable(String nameofcar) {
        for (Car car : lisofcars) {
            if (car.modelname == nameofcar) {
                if (car.isAvailable()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String checkAvailability(String nameofcar) {
        if (IsCarAvailable(nameofcar)) {
            return "This car is available to reserve";
        }
        return "Car not available";
    }

    public String ReserveACar(String nameofcar) {
        for (Car car : lisofcars) {
            if (car.modelname == nameofcar) {
                if (IsCarAvailable(nameofcar)) {
                    car.ReserveCar();
                    return "Car Reserved";
                }
            }
            return "This car can not be reserved";
        }
        return "Car not found";
    }
}
