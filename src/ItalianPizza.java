public class ItalianPizza extends PizzaBridge{
    public ItalianPizza(Pizza pizza){
        super(pizza);
    }
    @Override
    void makeCrust() {
        pizza.setCrust("thin");
    }

    @Override
    void layerSauce() {
        pizza.setSauce("oil");
    }

}
