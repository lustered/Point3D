public class Parallelepiped extends Shape3D
{
    private double length ; 
    private double width ; 
    private double height ; 
    private String shapeName ;

    public Parallelepiped(Point3D point, double length, double width, double height)
    {
        super(point);
        this.height = height ;
        shapeName = "Parallelepiped" ;
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
        
        return String.format("\nName:\t%s\nCenter\tlength:%5d\twidth:%5d\theight:%5d.", 
                this.shapeName, super.toString(), this.length, this.width, this.height);
    }

}
