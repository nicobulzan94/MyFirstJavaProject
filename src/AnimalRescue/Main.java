package AnimalRescue;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Adopter adopter = new Adopter();
        Veterinarian vet = new Veterinarian();
        PetFood petFood = new PetFood();
        DogFood dogFood = new DogFood();
        Cat cat = new Cat();

        adopter.setAdopterName("Nico");
        adopter.setMoney(1500);
        dog.setDogName("Mago");
        dog.setAge(7);
        dog.setBreed("Labrador");
        dog.setFavFood("bones yum yum");
        dog.setHappinessLevel(8);
        dog.setFavActivity("playing fetch");
        vet.setVetName("Dr Mike");
        vet.setVetSpecialization("Family Pet Dr");
        dogFood.setFoodName("Pedigree");
        cat.setCatName("Fifi");



        System.out.println(adopter.getAdopterName() + " has " + adopter.getMoney() + " lei for the adoption of a " + dog.getBreed());
        System.out.println(adopter.getAdopterName() + " adopts " + dog.getDogName());
        System.out.println(dog.getDogName() + " is " + dog.getAge() + " years old.");
        System.out.println(adopter.getAdopterName() + " and " + dog.getDogName() + " play together.");
        adopter.playFetchWithDog();
        dog.playFetch();

        System.out.println(vet.getVetName() + " sells to " + adopter.getAdopterName() + " " + dogFood.getFoodName());
        adopter.giveTreat();



    }
}
