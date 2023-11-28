public class AmericanPizza extends PizzaBridge{
    public AmericanPizza(Pizza pizza){
        super(pizza);
        pizza.setCrust("thick");
        pizza.setSauce("tomato");
    }

}
