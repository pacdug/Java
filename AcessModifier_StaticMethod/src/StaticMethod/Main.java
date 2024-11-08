package StaticMethod;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"manh");
        Student s2 = new Student(222,"vuong");
        Student s3 = new Student(333,"son");

        s1.display();
        s2.display();
        s3.display();
    }
}
