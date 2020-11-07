import java.util.Arrays; 

public class TestShapes
{
    public static void main(String[] args) 
    {
        Shape3D[] shapes = new Shape3D[4] ; 
        shapes[0] = new Sphere(new Point3D(8, 5, 2), 14) ; 
        shapes[1] = new Cone(new Point3D(-1, 4, -5), 11, 15) ; 
        shapes[2] = new Cylinder(new Point3D(5, -7, -35), 14, 12) ; 
        shapes[3] = new Parallelepiped(new Point3D(9, 16, 7), 19, 9, 13) ; 

        for (Shape3D shape : shapes) 
            System.out.format("\n%s | Surface Area: %.3f", shape, shape.getSurfaceArea()) ;

        System.out.println("\n\nUnsorted Array values.");

        // Print name and volume of unsorted.
        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

        Arrays.sort(shapes) ; 
        System.out.println("\n\nArray has been sorted in ascending order.");

        // Print name and volume of sorted in ascending order.
        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

        Arrays.sort(shapes) ; 
        System.out.println("\n\nArray has been sorted in descending order.");

        // Print name and volume of sorted in ascending order.
        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

    }
}
