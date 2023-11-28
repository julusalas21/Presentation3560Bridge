public class ItalianPizza implements Pizza{
    private String italian=" with Bay Leaves and Oregano";
    public String Pepperoni(){
        return("Yummy pepperoni"+ italian);
    }
    public String Veggie(){
        return("Yummy Veggie"+ italian);
    }
    public String Chicken(){
        return("Yummy chicken"+ italian);
    }
}
