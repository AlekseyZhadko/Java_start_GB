package GBJavaExceptions.Seminar3.Task1.Homework.Actions;

import GBJavaExceptions.Seminar3.Task1.Homework.Core.Models.People;
import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.DataIsMoreSizeException;
import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.DataLessSizeException;
import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.IncorrectDataException;

public class ElementArraySum {
    public static void ElementArraySum(String[] inputArray) throws DataIsMoreSizeException,
            DataLessSizeException, IncorrectDataException {
        People people = new People();
        if (inputArray.length == 6) {
            ParseData.Parse(people, inputArray);
            CheckValidDataPeople.Check(people);
            CheckFileExists.Check(people);
        } else {
            if (inputArray.length < 6) {
                throw new DataLessSizeException();
            } else {
                throw new DataIsMoreSizeException();
            }
        }
    }
}
