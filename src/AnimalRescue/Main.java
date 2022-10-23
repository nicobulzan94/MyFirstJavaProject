package AnimalRescue;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        DogPet dog = new DogPet();
        Adopter adopter = new Adopter();
        Veterinarian vet = new Veterinarian();

        System.out.println(adopter.adopterName + " adopts " + dog.dogName);
        System.out.println(dog.dogName + " is " + dog.age);
        System.out.println("Nico and Mago play together");
        adopter.playFetchWithDog();
        dog.playFetch();

        System.out.println("Mago loves " + dog.favFood);
        System.out.println(vet.vetName + " sells to Nico " + vet.foodName);
        adopter.giveTreat();



    }
}
