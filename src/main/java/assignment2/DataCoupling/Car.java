package assignment2.DataCoupling;

import jdk.jshell.Snippet;

public class Car {
    String  modelname;
    int car_id;
    String status="free";

    public boolean isAvailable()
    {
        if(this.status=="free")
        {
            return true;
        }
        return false;
    }
    public void ReserveCar()
    {
        this.status="Reserved";
    }
}
