package fan;

public class Fan {
    public static final int Slow = 1 ;
    public static final int Medium = 2 ;
    public static final int Fast = 3 ;

    private int speed ;
    private boolean on ;
    private double radius ;
    private String color ;

    public Fan() {
        this.speed = Slow ;
        this.on = false ;
        this.radius = 5.0 ;
        this.color = "blue" ;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) { return "Fan is on. Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off. Color: " + color + ", Radius: " + radius;
        }
    }
}
