package AnimalRescue;

public abstract class Animal {
    private int age;
    private String breed;
    private int hungerLevel;
    private int happinessLevel;
    private String favFood;
    private String favActivity;


    public abstract void speak();
    public abstract void sleep();
    public abstract void eat();
    public abstract void run();
    public abstract void seekAffection();
    public abstract void searchingForFood();


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
