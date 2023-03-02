package GBJavaExceptions.Seminar3.Task1.Homework.Actions;

import GBJavaExceptions.Seminar3.Task1.Homework.Actions.CheckDateIsValid.CheckDateIsValid;
import GBJavaExceptions.Seminar3.Task1.Homework.Core.Models.People;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParseData {
    private static Pattern Numberic = Pattern.compile("^[a-zA-Z]*$");

    public static boolean isAlphaNumeric(String s) {
        return Numberic.matcher(s).find();
    }

    public static void Parse(People people, String[] inputArray) {
        List<String> FIO = new ArrayList<>();
        for (String el : inputArray) {
            if (isAlphaNumeric(el)) {
                if (el.toLowerCase().equals("f") || el.toLowerCase().equals("m")) {
                    people.setGender(el);
                } else {
                    FIO.add(el);
                }
            } else {
                if (el.contains(".")) {
                    if (CheckDateIsValid.Check(el)) {
                        people.setDateOfBirth(el);
                    }
                } else {
                    if (people.getPhoneNumber() == null) {
                        people.setPhoneNumber(el);
                    }
                }
            }
        }
        if (FIO.size() >= 3) {
            people.setFirstName(FIO.get(1));
            people.setLastName(FIO.get(0));
            people.setMiddleName(FIO.get(2));
        }
    }
}
