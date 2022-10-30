package AnimalRescue;

public class Veterinarian {
    private String vetName;
    private String vetSpecialization;

    private String foodName;
    private int foodPrice;//RON pe 5kg
    private int foodQuantity;//total kgs owned
    boolean foodinStock = true;

    public void checkHeartBeat() {
        System.out.println("Ba boom Ba bump");
    }


    //Tema Lab12: encapsulation
    //private String vetName
    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
    public String getVetName() {
        return vetName;
    }

    //private String vetSpecialization
    public void setVetSpecialization(String vetSpecialization) {
        this.vetSpecialization = vetSpecialization;
    }
    public String getVetSpecialization() {
        return vetSpecialization;
    }

    //private String foodName
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodName() {
        return foodName;
    }

    //private int foodPrice
    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
    public int getFoodPrice() {
        return foodPrice;
    }

    //private int foodQuantity
    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }
    public int getFoodQuantity() {
        return foodQuantity;
    }


















    }


