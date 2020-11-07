public class Sphere extends Shape3D
{
    private double radius ; 
    private final String shapeName ;

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

    @Override
    public String getShapeName() 
    {
        return this.shapeName;
    }

    @Override
    public String toString() 
    {
        return String.format("\n%-14s| %s radius: %.2f", getShapeName(), super.toString(), this.radius);
    }

}
