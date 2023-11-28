public class VeggiePizza implements Pizza{
    private String topping="veggie";
    private String sauce;
    private String crust;
    public void setSauce(String sauce){
        this.sauce=sauce;
    }
    public void setCrust(String crust){
        this.crust=crust;
    }
    public String getTopping(){
        return topping;
    }
    public String getSauce(){
        return sauce;
    }
    public String getCrust(){
        return crust;
    }

}