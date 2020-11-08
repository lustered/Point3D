import java.util.Arrays; 

/**
 * Test class for the {@link Shape3D} implementation.
 */
public class TestShapes
{
    public static void main(String[] args) 
    {
        // Create an array with the subclasses passing the center point and 
        // respective properties.
        Shape3D[] shapes = new Shape3D[4] ; 
        shapes[0] = new Sphere(new Point3D(8, 5, 2), 14) ; 
        shapes[1] = new Cone(new Point3D(-1, 4, -5), 11, 15) ; 
        shapes[2] = new Cylinder(new Point3D(5, -7, -35), 14, 12) ; 
        shapes[3] = new Parallelepiped(new Point3D(9, 16, 7), 19, 9, 13) ; 

        // Print the initial values created above and their area.
        System.out.println("Initial Values") ;
        for (Shape3D shape : shapes) 
            System.out.format("\n%s | Surface Area: %.3f", shape, shape.getSurfaceArea()) ;

        System.out.println("\n\nUnsorted Array values.");

        // Print the shape's name and the volume. Unsorted.
        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

        Arrays.sort(shapes) ; 
        System.out.println("\n\nArray has been sorted in ascending order by volume.");

        // Print the shape's name and the volume. Sorted in ascending order.
        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

        Arrays.sort(shapes, new DescendingSort()) ; 
        System.out.println("\n\nArray has been sorted in descending order by distance from origin.");

        // Print the shape's name and distance of the center point from the origin in descending order.
        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Distance from center: %.3f", shape.getShapeName() , shape.getCenterPoint()) ; 
    }
}
