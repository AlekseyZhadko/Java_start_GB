package GBJavaFinalCertification.Java.Core.Models;

public abstract class Pet extends Animal {
    public Pet(){}
    public Pet(int id, String nameAnimal, String dateOfBirth, String command) {
        super(id, nameAnimal, dateOfBirth, command);
    }
}
