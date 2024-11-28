package validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmails = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmails = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();

        for(String email : validEmails) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email: " + email + " isvalid: " + isvalid);
        }

        for(String email : invalidEmails) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email: " + email + " isvalid: " + isvalid);
        }
    }
}
