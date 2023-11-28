public class AmericanPizza extends PizzaBridge{
    public AmericanPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    void makeCrust() {
        pizza.setCrust("thick");
    }

    @Override
    void layerSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    void addTopping(String topping) {
        pizza.setTopping(topping);
    }
}
