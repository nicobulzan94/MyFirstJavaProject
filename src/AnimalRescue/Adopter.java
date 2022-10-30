package AnimalRescue;

public class Adopter {
    private String adopterName;
    private int money;

    public void hugPet() {
        System.out.println("hugging...");
    }
    public void giveTreat() {
        System.out.println("feeding pet...");
    }
    public void walkPet() {
        System.out.println("tap-tap-tap...");
    }
    public void playFetchWithDog() {
        System.out.println("throw the toy...vrrrr");
    }



    //Tema Lab12: encapsulation
    public void setAdopterName(String adopterName){
        this.adopterName = adopterName;

    }
    public String getAdopterName(){
        return adopterName;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }












}
