public class Sphere extends Shape3D
{
    private double radius ; 
    private String shapeName ;

    public Sphere(Point3D point, double radius)
    {
        super(point);
        this.radius = radius ;
        shapeName = "Sphere" ;
    }

    @Override
    public double getVolume() 
    {
        return ( (4.0 / 3.0) * (Math.PI * Math.pow(radius, 3)) );
    }

    @Override
    public double getSurfaceArea() 
    {
        return ( 4 * (Math.PI * Math.pow(radius, 2)) );
    }

    public String getShapeName() 
    {
        return shapeName;
    }

    @Override
    public String toString() 
    {
        
        return String.format("\nName:\t%s\nCenter\tradius:%5d",this.shapeName, super.toString(), this.radius);
    }

}
