package AnimalRescue;

public class Animal {
    private int age;
    private String breed;
    private int hungerLevel;
    private int happinessLevel;
    private String favFood;
    private String favActivity;


    public void speak() {
        System.out.println("animal sounds..");
    }
    public void sleep() {
        System.out.println("ZZzzZZZzzzz");
    }


    //Tema Lab12: encapsulation
    //private String dogName


    //private int age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //private String breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    //private int hungerLevel
    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }

    //private int happinessLevel
    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }
    public int getHappinessLevel() {
        return happinessLevel;
    }

    //private String favFood
    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    public String getFavFood() {
        return favFood;
    }

    //private String favActivity
    public void setFavActivity(String favActivity) {
        this.favActivity = favActivity;
    }
    public String getFavActivity() {
        return favActivity;
    }







}
