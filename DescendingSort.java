import java.util.Comparator;

class DescendingSort implements Comparator<Shape3D>
{
    public int compare(Shape3D s1, Shape3D s2)
    {
        if(s1.getCenterPoint() > s2.getCenterPoint())
            return 1 ;
        if(s1.getCenterPoint() < s2.getCenterPoint())
            return -1 ;

        if(s1.equals(s2))
            return 0 ;

        return -2;
    }
}
