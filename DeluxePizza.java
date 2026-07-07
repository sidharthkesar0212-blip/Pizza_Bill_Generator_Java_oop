public class DeluxePizza extends Pizza{
    public DeluxePizza(boolean veg){
        super(veg);
        super.getExtraCheese();
        super.getExtraToppings();
        price -= 200;
    }

    @Override
    public void getExtraCheese() {}

    @Override
    public void getExtraToppings() {}
}
