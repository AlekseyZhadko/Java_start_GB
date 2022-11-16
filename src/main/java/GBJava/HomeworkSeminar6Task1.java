package GBJava;

import java.util.HashSet;
import java.util.Set;

public class HomeworkSeminar6Task1 {
    public static void main(String[] args) {
        VeterinaryClinicSystem system = new VeterinaryClinicSystem();
        system.registrationCat(1, "Bars", "Broun", 5, "Siamese", "IvanovAA", 81425);
        system.registrationCat(1, "Bars", "Broun", 5, "Siamese", "PetrovaII", 82425);
        system.registrationCat(2, "Murka", "White", 3, "Siamese", "PetrovaII", 82425);
        for (VeterinaryClinicSystem.Cat value : system.catSet) {
            System.out.print(value.toString());
        }
    }
}

class VeterinaryClinicSystem {
    public Set<Cat> catSet;

    public VeterinaryClinicSystem() {
        catSet = new HashSet<>();
    }

    public void registrationCat(int idCat, String nameCat, String colorCat, int ageCat, String speciesCat, String ownerFIO, int phoneOwner) {
        Cat cat = new Cat(idCat, nameCat, colorCat, ageCat, speciesCat, ownerFIO, phoneOwner);
        catSet.add(cat);
    }

    public class Cat {
        private int idCat;
        private String nameCat;
        private String colorCat;
        private int ageCat;
        private String speciesCat;
        private String ownerFIO;
        private int phoneOwner;

        public Cat(int idCat, String nameCat, String colorCat, int ageCat, String speciesCat, String ownerFIO, int phoneOwner) {
            this.idCat = idCat;
            this.nameCat = nameCat;
            this.colorCat = colorCat;
            this.ageCat = ageCat;
            this.speciesCat = speciesCat;
            this.ownerFIO = ownerFIO;
            this.phoneOwner = phoneOwner;
        }

        @Override
        public int hashCode() {
            return idCat;
        }

        @Override
        public boolean equals(Object obj) {
            Cat c = (Cat) obj;
            return idCat == c.idCat && nameCat == c.nameCat;
        }

        @Override
        public String toString() {
            return String.format("Name cat: %s\n" +
                            "Color cat: %s\n" +
                            "Age cat: %d\n" +
                            "Special cat: %s\n" +
                            "Owner FIO: %s\n" +
                            "Phone owner: %d\n\n",
                    nameCat, colorCat, ageCat, speciesCat, ownerFIO, phoneOwner);
        }
    }
}

