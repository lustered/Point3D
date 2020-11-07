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
    public double getVolume() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double getSurfaceArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        
        return String.format("\nName:\t%s\nCenter\tradius:%5d",this.shapeName, super.toString(), this.radius);
    }

}
