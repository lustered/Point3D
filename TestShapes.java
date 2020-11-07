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

        System.out.println("Initial Values");
        for (Shape3D shape : shapes) 
            System.out.format("\n%s | Surface Area: %.3f", shape, shape.getSurfaceArea()) ;

        System.out.println("\n\nUnsorted Array values.");

        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

        Arrays.sort(shapes) ; 
        System.out.println("\n\nArray has been sorted in ascending order by volume.");

        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Volume: %.3f", shape.getShapeName() , shape.getVolume()) ; 

        Arrays.sort(shapes, new DescendingSort()) ; 
        System.out.println("\n\nArray has been sorted in descending order by distance from origin.");

        for (Shape3D shape : shapes) 
            System.out.format("\n%-14s | Distance from center: %.3f", shape.getShapeName() , shape.getCenterPoint()) ; 

    }
}
