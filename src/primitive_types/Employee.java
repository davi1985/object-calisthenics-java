package primitive_types;

import primitive_types.object_values.Age;
import primitive_types.object_values.Cpf;
import primitive_types.object_values.Email;

public class Employee {

    private final Email email;
    private final Cpf cpf;
    private final Age age;


    public Employee(final Email email, final Cpf cpf, final Age age) {
        this.email = email;
        this.cpf = cpf;
        this.age = age;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public String getCpf() {
        return cpf.getCpf();
    }

    public Long getAge() {
        return age.getAge();
    }
}
