/**
 * Model a sphere shape.
 */
public class Sphere extends Shape3D
{
    // Variable properties of sphere.
    private double radius ; 

    /**
     * Create a sphere.
     *
     * @param point {@link Point3D} 
     * @param radius radius of the sphere.
     */
    public Sphere(Point3D point, double radius)
    {
        super(point) ;
        this.radius = radius ;
    }

    @Override
    public double getVolume() 
    {
        return ( (4.0 / 3.0) * (Math.PI * Math.pow(radius, 3)) ) ;
    }

    @Override
    public double getSurfaceArea() 
    {
        return ( 4 * (Math.PI * Math.pow(radius, 2)) ) ;
    }

    /**
     * Return a String with the cylinder's property.
     *
     * @return String of the cylinder's property.
     */
    @Override
    public String toString() 
    {
        return String.format("%-14s| %s radius: %.2f", getShapeName(), super.toString(), this.radius) ;
    }

}
