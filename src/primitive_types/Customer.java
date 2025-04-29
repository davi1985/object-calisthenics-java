package primitive_types;

import primitive_types.object_values.Age;
import primitive_types.object_values.Cpf;
import primitive_types.object_values.Email;

public class Customer {

    private final Email email;
    private final Cpf cpf;
    private final Age age;

    public Customer(final Email email, final Cpf cpf, final Age age) {
        this.cpf = cpf;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "\"email\": \"" + email.getEmail() + "\", " +
                "\"cpf\": \"" + cpf.getCpf() + "\", " +
                "\"age\": \"" + age.getAge() + "\"" +
                "}";
    }
}
