public class PizzaBridge implements Bridge{
    private Pizza pizza;
    PizzaBridge(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String Pepperoni() {
        return pizza.Pepperoni();
    }

    @Override
    public String Veggie() {
        return pizza.Veggie();
    }

    @Override
    public String Chicken() {
        return pizza.Chicken();
    }
}
