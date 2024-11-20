package quadraticequation;

public class quadraticEquation {
    int a, b, c;

    public quadraticEquation(){

    }

    public quadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Delta(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        return (-b + Math.sqrt(Delta())) / (2 * a);
    }

    public double getRoot2(){
        return (-b - Math.sqrt(Delta())) / (2 * a);
    }
}
