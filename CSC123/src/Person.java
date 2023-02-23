//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
