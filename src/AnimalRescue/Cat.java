package AnimalRescue;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Miau miau");
    }

    @Override
    public void seekAffection() {
        System.out.println("cat caresses the human...");
    }

    @Override
    public void searchingForFood() {
        System.out.println("the cat moves its whiskers...");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZzzzzZZZzzzz");
    }

    @Override
    public void eat() {
        System.out.println("Yum yum yum");
    }

    @Override
    public void run() {
        System.out.println("running with quick paws...");
    }

    public void play() {
        System.out.println("scratching the cat toy...");
    }


    private String catName;
    public void setCatName(String dogName) {
        this.catName = catName;
    }
    public String getCatName() {
        return catName;
    }

}
