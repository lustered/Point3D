public class Cylinder extends Shape3D
{
    private double height ; 
    private double radius ; 
    private String shapeName ;

    public Cylinder(Point3D point, double height, double radius)
    {
        super(point);
        this.height = height ;
        this.radius = radius ;
        shapeName = "Cylinder" ;
    }

    @Override
    public double getVolume() 
    {
        return Math.PI * Math.pow(radius, 2) * height ;
    }

    @Override
    public double getSurfaceArea() 
    {
        return ((2 * (Math.PI * Math.pow(radius, 2))) + (2 * Math.PI * radius * height));
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
