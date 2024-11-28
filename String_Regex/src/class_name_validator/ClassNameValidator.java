package class_name_validator;

public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]*$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        String[] classNames = {"C0223G", "A0323****", "M0318G", "P0323A", "C1234H", "A0000K"};

        for (String className : classNames) {
            if (isValidClassName(className)) {
                System.out.println(className + " là tên lớp hợp lệ.");
            } else {
                System.out.println(className + " là tên lớp không hợp lệ.");
            }
        }
    }
}
