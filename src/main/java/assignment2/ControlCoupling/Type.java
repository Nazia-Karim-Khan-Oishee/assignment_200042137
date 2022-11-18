package assignment2.ControlCoupling;

public class Type {
    public boolean IsEven(int number) {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }
    public boolean IsOdd(int number) {
        if(number%2!=0)
        {
            return true;
        }
        return false;
    }
}
