package AnimalRescue;

public class Adopter extends Human{
    private String adopterName;
    private int money;


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


    @Override
    public void hugPet() {
        System.out.println("hugging the pet while showering it with kisses.");
    }

    @Override
    public void caressPet() {
        System.out.println("stroking lovingly the pet...");
    }
}
