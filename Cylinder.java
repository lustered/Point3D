public class Cylinder extends Shape3D
{
    private double height ; 
    private double radius ; 

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
        return ((2 * (Math.PI * Math.pow(radius, 2))) + (2 * Math.PI * radius * height));
    }

    @Override
    public String toString() 
    {
        
        return String.format("%-14s| %s radius: %5.2f | height: %.2f ", getShapeName(), super.toString(), this.radius, this.height);
    }

}
