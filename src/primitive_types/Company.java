package primitive_types;

public class Company {
    private String email;

    public Company(String email) {
        this.validateEmail(email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    private void validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email == null || !email.matches(emailRegex)) {
            throw new IllegalArgumentException("invalid email");
        }
    }
}
