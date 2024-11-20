package point2d_3d;

public class Main {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(1.0f, 2.0f);
        System.out.println("Point2D: " + point2D);
        System.out.println("XY Coordinates: " + java.util.Arrays.toString(point2D.getXY()));


        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        System.out.println("XYZ Coordinates: " + java.util.Arrays.toString(point3D.getXYZ()));
    }
}
