package assignment2.DataCoupling;

import java.awt.image.ShortLookupTable;

public class RentalAgency {
    String Name;
    String Address;

    public String CheckStatusOfAcar(CarReservationService service, String carname)
    {
         return service.checkAvailability(carname);
    }
    public String ReserveCar(CarReservationService service, String carname)
    {
       return service.ReserveACar(carname);
    }
}
