package Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();

        fan1.setSpeed(Fan.Fast);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.Slow);
        fan2.setOn(true);
        fan2.setRadius(15);
        fan2.setColor("red");
        System.out.println(fan2.toString());
    }
}
