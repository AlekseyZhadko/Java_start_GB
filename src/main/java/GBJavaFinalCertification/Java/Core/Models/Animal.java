package GBJavaFinalCertification.Java.Core.Models;

public abstract class Animal {
    private int id;
    private String dateOfBirth;
    private String nameAnimal;
    private String command;

    public Animal(int id, String nameAnimal, String dateOfBirth, String command) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.nameAnimal = nameAnimal;
        this.command = command;
    }

    public Animal() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public String getCommand() {
        return command;
    }
}
