package AnimalRescue;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        DogPet dog = new DogPet();
        Adopter adopter = new Adopter();
        Veterinarian vet = new Veterinarian();

        adopter.setAdopterName("Nico");
        adopter.setMoney(1500);
        dog.setDogName("Mago");
        dog.setAge(7);
        dog.setBreed("Labrador");
        vet.setVetName("Dr Mike");
        vet.setFoodName("Pedigree");


        System.out.println(adopter.getAdopterName() + " has " + adopter.getMoney() + " lei for the adoption of a " + dog.getBreed());
        System.out.println(adopter.getAdopterName() + " adopts " + dog.getDogName());
        System.out.println(dog.getDogName() + " is " + dog.getAge());
        System.out.println(adopter.getAdopterName() + " and " + dog.getDogName() + " play together");
        adopter.playFetchWithDog();
        dog.playFetch();

        System.out.println(vet.getVetName() + " sells to " + adopter.getAdopterName() + " " + vet.getFoodName());
        adopter.giveTreat();



    }
}
