package GBJavaFinalCertification.Java.Core.Models;

public abstract class PackAnimal extends Animal {

    public PackAnimal(){

    }
    public PackAnimal(int id, String nameAnimal, String dateOfBirth, String command) {
        super(id, nameAnimal, dateOfBirth, command);
    }
}
