// Square implements Shape Interface
public class Square implements Shape 
{
    private double width;
    private double height;
     
    public Square(double w, double h)
    {
        this.width=w;
        this.height=h;
    }
    @Override
    public void draw() 
    {
        System.out.println("Drawing Square");
    }
 
    @Override
    public double getArea() 
    {
        return this.height*this.width;
    }
 
}