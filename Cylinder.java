/**
 * Model a cylinder shape.
 */
public class Cylinder extends Shape3D
{
    // Variable properties of cylinder.
    private double height ; 
    private double radius ; 

    /**
     * Create a cylinder.
     *
     * @param point {@link Point3D} 
     * @param height height of the cylinder.
     * @param radius radius of the cylinder.
     */
    public Cylinder(Point3D point, double height, double radius)
    {
        super(point);
        this.height = height ;
        this.radius = radius ;
    }

    @Override
    public double getVolume() 
    {
        return Math.PI * Math.pow(radius, 2) * height ;
    }

    @Override
    public double getSurfaceArea() 
    {
        return ((2 * (Math.PI * Math.pow(radius, 2))) + (2 * Math.PI * radius * height)) ;
    }

    /**
     * Return a String with the cylinder's property.
     *
     * @return String of the cylinder's property.
     */
    @Override
    public String toString() 
    {
        return String.format("%-14s| %s radius: %5.2f | height: %.2f ", getShapeName(), super.toString(), this.radius, this.height) ;
    }

}
