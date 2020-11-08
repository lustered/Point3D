/**
 * Models a point in 3D space.
 */
public class Point3D
{
    // Coordinates for the point.
    private final int x ;
    private final int y ;
    private final int z ;

    /**
     * Construct point in 3D space.
     *
     * @param x coordinate of point.
     * @param y coordinate of point.
     * @param z coordinate of point.
     */
    public Point3D(int x, int y, int z)
    {
        this.x = x ;
        this.y = y ;
        this.z = z ;
    }

    // Accessors
    /**
     * Get x value of 3D point.
     * @return x value of 3D point.
     */
    public int x()
    {
        return this.x ;
    }

    /**
     * Get y value of 3D point.
     * @return y value of 3D point.
     */
    public int y()
    {
        return this.y ;
    }

    /**
     * Get z value of 3D point.
     * @return z value of 3D point.
     */
    public int z()
    {
        return this.z ;
    }

    /**
     * Returns {@link String} of coordinates of 3D point. 
     * @return {@link String} with x,y,z coordinates.
     */
    @Override
    public String toString()
    {
        return String.format("(x: %3s | y: %3s | z: %3s)", x(),y(),z()) ;
    }
}
