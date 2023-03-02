package GBJavaExceptions.Seminar3.Task1.Homework.Actions;

import GBJavaExceptions.Seminar3.Task1.Homework.Core.Models.People;
import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.IncorrectDataException;

public class CheckValidDataPeople {
    public static void Check(People people) throws IncorrectDataException{
        StringBuilder sb = new StringBuilder();
        if (people.getFirstName() == null || people.getLastName() == null || people.getMiddleName() == null) {
            sb.append("<FIO>");
        }
        if (people.getDateOfBirth() == null) {
            sb.append("<DateOfBirth>");
        }
        if (people.getPhoneNumber() == null) {
            sb.append("<PhoneNumber>");
        }
        if (people.getGender() == null) {
            sb.append("<Gender>");
        }
        if (!sb.isEmpty()) {
            throw new IncorrectDataException(sb.toString());
        }
    }
}
