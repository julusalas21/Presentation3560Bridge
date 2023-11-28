public class ItalianPizza extends PizzaBridge{
    public ItalianPizza(Pizza pizza){
        super(pizza);
        pizza.setCrust("thin");
        pizza.setSauce("oil");
    }

}
