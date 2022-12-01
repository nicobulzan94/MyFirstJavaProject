package AnimalRescue;

public class Dog extends Animal{

    private String dogName;


    public void playFetch() {
        System.out.println("fetching the toy...");
    }

    @Override
    public void eat() {
        System.out.println("Chew chew chew");
    }

    @Override
    public void run() {
        System.out.println("dog is trotting...");
    }

    @Override
    public void speak() {
        System.out.println("Woof woof");
    }

    @Override
    public void seekAffection() {
        System.out.println("licking the face of the human");
    }

    @Override
    public void searchingForFood() {
        System.out.println("sniffing around for food...");
    }

    @Override
    public void sleep() {
        System.out.println("SnnnooOOOrrriinnGGG...");
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
