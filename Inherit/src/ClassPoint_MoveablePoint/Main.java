package ClassPoint_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);

        MoveablePoint movablePoint = new MoveablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println("MovablePoint before move: " + movablePoint);

        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint);
    }
}
