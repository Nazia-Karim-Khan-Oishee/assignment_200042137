package assignment2.ControlCoupling;

public class Number {
    int number;
    public void Type(Type type, int number)
    {
        if(type.IsEven(number))
        {
            new PrintEvenType().printType();
        }
        if(type.IsOdd(number))
        {
            new PrintOddType().printType();
        }
    }


}
