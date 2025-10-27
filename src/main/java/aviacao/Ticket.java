package aviacao;

public class Ticket {
    private int id;
    private float price;
    private Passenger passenger;
    private String seat;
    private Flight flight;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price <= 0){
            System.out.println("Invalid price" + price);
        } else{
            this.price = price;
        }
    }

}
