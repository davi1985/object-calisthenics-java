package primitive_types.application;

import primitive_types.Customer;
import primitive_types.object_values.Age;
import primitive_types.object_values.Cpf;
import primitive_types.object_values.Email;

public class App {
    public static void main(String[] args) {
        var customer = new Customer(
                new Email("email@email.com"),
                new Cpf("65205832193"),
                new Age(40L)
        );

        System.out.println("Customer Details: ");
        System.out.println(customer);
    }
}
