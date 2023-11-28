public class Main {
    public static void main(String[] args) {
        AmericanPizza american=new AmericanPizza();
        ItalianPizza italian=new ItalianPizza();
        String chicken=new PizzaBridge(italian).Chicken();
        System.out.println(chicken);
        chicken=new PizzaBridge(american).Chicken();
        System.out.println(chicken);
    }
}