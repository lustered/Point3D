/**
 * Model a cone. 
 */
public class Cone extends Shape3D
{
    // Variable properties of Cone.
    private double height ; 
    private double radius ; 

    /**
     * Create a cone.
     *
     * @param point {@link Point3D} of the center.
     * @param height height of the cone.
     * @param radius radius of the cone.
     */
    public Cone(Point3D point, double height, double radius)
    {
        super(point) ; 
        this.height = height ;
        this.radius = radius ;
    }

    @Override
    public double getVolume() 
    {
        return ((Math.PI * Math.pow(radius, 2) * height) / 3) ; 
    }

    @Override
    public double getSurfaceArea() 
    {
        double slantHeight = Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2))) ; 

        return ((Math.PI * radius)*(radius + slantHeight)) ; 
    }

    /**
     * Return a String with the cone's property.
     *
     * @return String of the cone's property.
     */
    @Override
    public String toString() 
    {
        return String.format("%-14s| %s radius: %.2f | height: %.2f ", getShapeName(), super.toString(), this.radius, this.height) ; 
    }
}
