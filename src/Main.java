public class Main {
    public static void main(String[] args) {
        AmericanPizza AmerChicken=new AmericanPizza(new Pizza());
        AmerChicken.makeCrust();
        AmerChicken.layerSauce();
        AmerChicken.addTopping("chicken");
        
        ItalianPizza ItalChicken=new ItalianPizza(new Pizza());
        ItalChicken.makeCrust();
        ItalChicken.layerSauce();
        ItalChicken.addTopping("chicken");

        System.out.println(AmerChicken.toString());
        System.out.println(ItalChicken.toString());
    }
}