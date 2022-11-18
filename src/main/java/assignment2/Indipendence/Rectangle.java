package assignment2.Indipendence;

public class Rectangle {
    private double width;
   private double height;
    private double area;
   public Rectangle(double height,double width)
   {
       this.height=height;
       this.width=width;
   }
    public void Area(double height,double width)
    {
        this.area=new AreaCalculator().calculatearea(height,width);
    }

    public void setArea(double height,double width)
    {
        this.Area(height, width);
    }
    public double getArea()
    {
        return this.area;
    }
    public void setwidth(double width)
    {
        this.width=width;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getHeight()
    {
        return this.height;
    }
}
