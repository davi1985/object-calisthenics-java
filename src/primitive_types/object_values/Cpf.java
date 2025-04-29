package primitive_types.object_values;

public class Cpf {

    private String cpf;

    public Cpf(String cpf) {
        this.validate(cpf);

        this.cpf = cpf;
    }

    public String getCpf() {
      return cpf;
    }

    private void validate(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("invalid cpf");
        }

        int d1 = 0, d2 = 0;
        for (int i = 0; i < 9; i++) {
            int digit = cpf.charAt(i) - '0';
            d1 += digit * (10 - i);
            d2 += digit * (11 - i);
        }

        int check1 = d1 % 11 < 2 ? 0 : 11 - d1 % 11;
        d2 += check1 * 2;
        int check2 = d2 % 11 < 2 ? 0 : 11 - d2 % 11;

        if (check1 != cpf.charAt(9) - '0' || check2 != cpf.charAt(10) - '0') {
            throw new IllegalArgumentException("invalid cpf");
        }
    }
}
