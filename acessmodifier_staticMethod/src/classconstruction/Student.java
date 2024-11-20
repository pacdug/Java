package classconstruction;

public class Student {
    private String name;
    private String Classes;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.Classes = classes;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Class: " + this.Classes);
    }
}
