package AnimalRescue;

public class DogPet extends Animal{

    private String dogName;


    public void playFetch() {
        System.out.println("fetching the toy...");
    }


    //Tema Lab12: encapsulation
    //private String dogName
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
    public String getDogName() {
        return dogName;
    }













}
