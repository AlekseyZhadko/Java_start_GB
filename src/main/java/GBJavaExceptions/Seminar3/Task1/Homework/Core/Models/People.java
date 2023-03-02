package GBJavaExceptions.Seminar3.Task1.Homework.Core.Models;

public class People {
    String firstName;
    String lastName;
    String middleName;
    String dateOfBirth;
    String phoneNumber;
    String gender;

    public People() {
        this.lastName = null;
        this.firstName = null;
        this.middleName = null;
        this.dateOfBirth = null;
        this.phoneNumber = null;
        this.gender = null;
    }

    People(String firstName, String lastName, String middleName, String dateOfBirth, String phoneNumber, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "<" + firstName + ">" +
                "<" + lastName + ">" +
                "<" + middleName + ">" +
                "<" + dateOfBirth + ">" +
                "<" + phoneNumber + ">" +
                "<" + gender + ">";

    }
}

