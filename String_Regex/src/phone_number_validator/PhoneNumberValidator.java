package phone_number_validator;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        String[] phoneNumbers = { "(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)" };

        for (String phoneNumber : phoneNumbers) {
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber + " là số điện thoại hợp lệ.");
            } else {
                System.out.println(phoneNumber + " là số điện thoại không hợp lệ.");
            }
        }
    }
}

