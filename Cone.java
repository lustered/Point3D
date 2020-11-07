import java.lang.Math ;

public class Cone extends Shape3D
{
    private double height ; 
    private double radius ; 
    private String shapeName ;

    public Cone(Point3D point, double height, double radius)
    {
        super(point);
        this.height = height ;
        this.radius = radius ;
        shapeName = "Cone" ;
    }

    @Override
    public double getVolume() 
    {
        return ((Math.PI * Math.pow(radius, 2) * height) / 3);
    }

    @Override
    public double getSurfaceArea() 
    {
        double slantHeight = Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2)));

        return ((Math.PI * radius)*(radius + slantHeight));
    }

    public String getShapeName() 
    {
        return shapeName;
    } 

    @Override
    public String toString() 
    {
        
        return String.format("\nName:\t%s\nCenter\theight:%5d\tradius:%5d", this.shapeName, super.toString(), this.height, this.radius);
    }

}
