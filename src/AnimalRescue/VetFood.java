package AnimalRescue;

public class VetFood {
    private String foodName;
    private String foodType;
    private int foodPrice;//RON pe 5kg
    private int foodQuantity;//total kgs owned
    boolean foodinStock = true;

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

    //private String foodType
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }


    //private boolean foodinStock
    public void setFoodinStock(boolean foodinStock) {
        this.foodinStock = foodinStock;
    }
    public boolean getFoodinStock(){
        return foodinStock;
    }



}
