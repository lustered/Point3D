public abstract class Shape3D implements Comparable<Shape3D>
{
    private Point3D centerPoint ;

    public Shape3D(Point3D point)
    {
        this.centerPoint = new Point3D(point.x(), point.y(), point.z());
    }
    
    public Point3D getCenterPoint() 
    {
        return centerPoint;
    }

    public abstract double getSurfaceArea();
    public abstract double getVolume();
    public abstract String getShapeName();

    @Override
    public int compareTo(Shape3D shape)
    {
       return this.getVolume() > shape.getVolume() ? 1 :
              this.getVolume() < shape.getVolume() ? -1 : 0; 
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s", "Center at", this.centerPoint.toString());
    }
}
