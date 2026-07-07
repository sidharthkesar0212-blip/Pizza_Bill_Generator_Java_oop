public class Pizza {
     int price;

    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 100;
    private int takeAwayPrice = 20;

    private int basePizzaPrice;

    private int isExtraCheeseAdded = 0;
    private int isExtraToppingsAdded = 0;
    private boolean isTakeAwayOpted = false;

    public Pizza(boolean veg) {
        this.veg = veg;

        if(this.veg) price = 300;
        else price = 400;

        basePizzaPrice = this.price;
    }

    public void getExtraCheese(){
        isExtraCheeseAdded++;
        System.out.println("Extra Cheese Added!!!");
        this.price += extraCheesePrice;
    }

    public void getExtraToppings(){
        isExtraToppingsAdded++;
        System.out.println("Extra Toppings Added!!!");
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        isTakeAwayOpted = true;
        System.out.println("Take Away Opted !!!");
        this.price += takeAwayPrice;
    }

    public void getBill(){
        String bill = "";
        if(isExtraCheeseAdded != 0){
            bill += "Extra Cheese Added: Rs." + extraCheesePrice*isExtraCheeseAdded + "\n";
        }
        if(isExtraToppingsAdded != 0){
            bill += "Extra Toppings Addded: Rs." + extraToppingsPrice*isExtraToppingsAdded + "\n";
        }
        if(isTakeAwayOpted){
            bill += "Take Away Price: Rs." + takeAwayPrice + "\n";
        }
        bill += "Pizza: Rs." + basePizzaPrice + "\n";
        System.out.println("Your Total bill is:\n"+bill+"Total Price: Rs." + price);
    }
}
