public class CircleWithException{

    private double radius,area,diameter;
    private double pi = 3.14;


    CircleWithException(){}

    CircleWithException(double radius){
        this.radius = radius;
    }

    public double getDiameter()
    {
        return this.radius * 2;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return pi * this.radius * this.radius;
    }

}