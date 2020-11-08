import java.util.Comparator;

/**
 * Custom implementation of {@link Comparator} to order {@link Shape3D} objects
 * by the distance between center point and origin in descending order. 
 */
class DescendingSort implements Comparator<Shape3D>
{
    @Override
    /**
     * {@inheritDoc}
     */
    public int compare(Shape3D s1, Shape3D s2)
    {
        if(s1.getCenterPoint() < s2.getCenterPoint())
            return 1 ;
        if(s1.getCenterPoint() > s2.getCenterPoint())
            return -1 ;

        if(s1.equals(s2))
            return 0 ;

        return -2 ;
    }
}
