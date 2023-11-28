public class Main {
    public static void main(String[] args) {
        AmericanPizza americanStyle=new AmericanPizza(new ChickenPizza());
        ItalianPizza italianStyle=new ItalianPizza(new ChickenPizza());

        System.out.println("Chicken:");
        System.out.println(americanStyle.toString());
        System.out.println(italianStyle.toString());

        americanStyle=new AmericanPizza(new VeggiePizza());
        italianStyle=new ItalianPizza(new VeggiePizza());

        System.out.println("Veggie:");
        System.out.println(americanStyle.toString());
        System.out.println(italianStyle.toString());

        americanStyle=new AmericanPizza(new PepperoniPizza());
        italianStyle=new ItalianPizza(new PepperoniPizza());

        System.out.println("Pepperoni:");
        System.out.println(americanStyle.toString());
        System.out.println(italianStyle.toString());
    }
}