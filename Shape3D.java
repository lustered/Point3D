public abstract class Shape3D implements Comparable<Shape3D>
{
    private Point3D startingPoint3D ;

    public Shape3D(Point3D point)
    {
        this.startingPoint3D = new Point3D(point.x(), point.y(), point.z()) ;
    }
    
    public double getCenterPoint() 
    {
        return Math.sqrt(( Math.pow(startingPoint3D.x(), 2) +
                           Math.pow(startingPoint3D.y(), 2) + 
                           Math.pow(startingPoint3D.z(), 2) )) ;
    }

    public abstract double getSurfaceArea();
    public abstract double getVolume();

    public String getShapeName(){
        return this.getClass().getCanonicalName() ;
    }

    @Override
    public int compareTo(Shape3D shape)
    {
       return this.getVolume() > shape.getVolume() ? 1 :
              this.getVolume() < shape.getVolume() ? -1 : 0 ;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj == this);
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s", "Center at", this.startingPoint3D.toString()) ;
    }
}
