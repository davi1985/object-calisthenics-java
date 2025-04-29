package primitive_types.object_values;

public class Email {

    private String email;

    public Email(String email) {
        this.validate(email);

        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    private void validate(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email == null || !email.matches(emailRegex)) {
            throw new IllegalArgumentException("invalid email");
        }
    }
}
