public class Point3D
{
    private final int x ;
    private final int y ;
    private final int z ;

    public Point3D(int x, int y, int z)
    {
        this.x = x ;
        this.y = y ;
        this.z = z ;
    }

    public int x()
    {
        return this.x;
    }

    public int y()
    {
        return this.y;
    }

    public int z()
    {
        return this.z;
    }

    @Override
    public String toString()
    {
        return String.format("(x: %3s | y: %3s | z: %3s)", x(),y(),z());
    }
}
