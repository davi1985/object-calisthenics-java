package primitive_types.object_values;

public class Age {
    private Long age;

    public Age(Long age) {
        this.validate(age);

        this.age = age;
    }

    private void validate(Long age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalArgumentException("invalid age");
        }
    }

    public Long getAge() {
        return age;
    }
}
