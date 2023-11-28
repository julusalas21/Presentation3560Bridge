public class Main {
    public static void main(String[] args) {
        AmericanPizza americanStyle=new AmericanPizza(new ChickenPizza());
        americanStyle.makeCrust();
        americanStyle.layerSauce();

        ItalianPizza italianStyle=new ItalianPizza(new ChickenPizza());
        italianStyle.makeCrust();
        italianStyle.layerSauce();

        System.out.println("Chicken:");
        System.out.println(americanStyle.toString());
        System.out.println(italianStyle.toString());

        americanStyle=new AmericanPizza(new VeggiePizza());
        americanStyle.makeCrust();
        americanStyle.layerSauce();
        italianStyle=new ItalianPizza(new VeggiePizza());
        italianStyle.makeCrust();
        italianStyle.layerSauce();

        System.out.println("Veggie:");
        System.out.println(americanStyle.toString());
        System.out.println(italianStyle.toString());

        americanStyle=new AmericanPizza(new PepperoniPizza());
        americanStyle.makeCrust();
        americanStyle.layerSauce();
        italianStyle=new ItalianPizza(new PepperoniPizza());
        italianStyle.makeCrust();
        italianStyle.layerSauce();

        System.out.println("Pepperoni:");
        System.out.println(americanStyle.toString());
        System.out.println(italianStyle.toString());
    }
}