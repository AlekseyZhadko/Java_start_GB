package GBJavaOOP.Seminar3.Task1;

public class Person implements Human {

    private final String fullName;

    private final String gender;

    public Person(String fullName, String gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}