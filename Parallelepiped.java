/**
 * Model a Parallelepiped shape.
 */
public class Parallelepiped extends Shape3D
{
    // Variable properties of parallelepiped.
    private double length ; 
    private double width ; 
    private double height ; 

    /**
     * Create a parallelepiped shape.
     */
    public Parallelepiped(Point3D point, double length, double width, double height)
    {
        super(point) ;
        this.length = length ;
        this.width = width ;
        this.height = height ;
    }

    @Override
    public double getVolume() {
        return (length * width * height) ;
    }

    @Override
    public double getSurfaceArea() 
    {
        double lw = length * width ;
        double lh = length * height ;
        double hw = height * width ;

        return ( 2 * (lw + lh + hw) ) ;
    }


    /**
     * Return a String with the parallelepiped's property.
     *
     * @return String of the parallelepiped's property.
     */
    @Override
    public String toString() 
    {
        return String.format("%-14s| %s length: %.2f | width: %.2f | height:%.2f",
                getShapeName(), super.toString(), this.length, this.height, this.width);
    }

}
