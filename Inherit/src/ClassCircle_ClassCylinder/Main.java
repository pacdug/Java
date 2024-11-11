package ClassCircle_ClassCylinder;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());

        // Tạo đối tượng Cylinder
        Cylinder cylinder = new Cylinder(2.5, "green", 5.0);
        System.out.println(cylinder);
        System.out.println("Cylinder Area: " + cylinder.getArea());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}
