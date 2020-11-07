public abstract class Shape3D implements Comparable<Shape3D>
{
    private Point3D centerPoint ;

    public Shape3D(Point3D point)
    {
        this.centerPoint = new Point3D(point.x(), point.y(), point.z());
    }
    
    // 3.has a concrete method that computes and returns the distance of the center of the shape from the origin (i.e., point 0,0,0)
    public Point3D getCenterPoint() 
    {
        return centerPoint;
    }

    public abstract double getSurfaceArea();
    public abstract double getVolume();

    @Override
    public int compareTo(Shape3D shape)
    {
       return this.getVolume() > shape.getVolume() ? 1 :
              this.getVolume() < shape.getVolume() ? -1 : 0; 
    }

    @Override
    public String toString()
    {
        return "Center: " + this.centerPoint.toString();
    }
}
