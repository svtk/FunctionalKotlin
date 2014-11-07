package java_examples;

public class JPerson {
    private final String name;
    private final Integer age;

    public JPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public JPerson(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
