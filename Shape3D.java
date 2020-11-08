/**
 * Models a 3D shape.
 */
public abstract class Shape3D implements Comparable<Shape3D>
{
    // Starting center point for a 3D shape.
    private Point3D startingPoint3D ;

    /**
     * Abstract method to get the surface area of a 3D shape.
     *
     * @return area of the 3D shape.
     */
    public abstract double getSurfaceArea() ;

    /**
     * Abstract method to get the volume of a 3D shape.
     *
     * @return volume of the 3D shape.
     */
    public abstract double getVolume() ;

    /**
     * Constructor for a shape with 3D points.
     * @param point {@link Point3D} with the center of the shape.
     */
    public Shape3D(Point3D point)
    {
        this.startingPoint3D = new Point3D(point.x(), point.y(), point.z()) ;
    }
    
    /**
     * Compute and return the distance between the center point and origin.
     * @return distance from the center.
     */
    public double getCenterPoint() 
    {
        return Math.sqrt(( Math.pow(startingPoint3D.x(), 2) +
                           Math.pow(startingPoint3D.y(), 2) + 
                           Math.pow(startingPoint3D.z(), 2) )) ;
    }

    /**
     * Return the name of the class.
     * @return Name of the class.
     */
    public String getShapeName()
    {
        return this.getClass().getCanonicalName() ;
    }

    /**
     * Comparable implementation to check ascending order by volume.
     * @param shape {@link Shape3D} reference to compare against.
     */
    @Override
    public int compareTo(Shape3D shape)
    {
       return this.getVolume() > shape.getVolume() ? 1 :
              this.getVolume() < shape.getVolume() ? -1 : 0 ;
    }

    /**
     * Implementation of .equals to compare {@link Shape3D} objects
     */
    @Override
    public boolean equals(Object obj) 
    {
        return (obj == this);
    }

    /**
     * Return a String with the center point.
     */
    @Override
    public String toString()
    {
        return String.format("%s: %s", "Center at", this.startingPoint3D) ;
    }
}
