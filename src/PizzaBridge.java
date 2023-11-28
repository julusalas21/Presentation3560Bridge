public abstract class PizzaBridge {
    protected Pizza pizza;
    PizzaBridge(Pizza pizza){
        this.pizza=pizza;
    }

    public String toString(){
        return ("This pizza has a "+pizza.getCrust()+" crust, "+pizza.getSauce()+" sauce, and it has "+pizza.getTopping()+" for toppings.");
    }
}
