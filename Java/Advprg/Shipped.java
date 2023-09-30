package Advprg;

public class Shipped extends Order {
    private boolean isShip;
    private String shipperName;
    private double shippingCharge = 4;
    
    public Shipped(){}

    public Shipped(String cusName, String cusNb, double totalPrice, boolean isShip, String shipperName){
        super();
        this.isShip=isShip;
        this.shipperName= shipperName;
    }

    public String getShipperName() {
        return shipperName;
    }
    public boolean isShip(){
        return isShip;
    }

    
}
