package Advprg;

import javax.sound.sampled.SourceDataLine;

public class Order {
    private String cusName, cusNb;
    private int qtyOrder;
    private double unitPrice;
    private double totalPrice;
    
    public Order(){} 
    
    public Order(String cusName, String cusNb, double unitPrice, int qtyOrder ){
        this.cusName= cusName;
        this.cusNb= cusNb;
        this.unitPrice= unitPrice;
        this.qtyOrder= qtyOrder;
    }
//get
    public String getCusName() {
        return cusName;
    }
    public String getCusNb() {
        return cusNb;
    }
    public int getQtyOrder() {
        return qtyOrder;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
//set
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public void setCusNb(String cusNb) {
        this.cusNb = cusNb;
    }
    public void setQtyOrder(int qtyOrder) {
        this.qtyOrder = qtyOrder;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
//calculate total
    public double calTotal(){
        totalPrice=unitPrice*qtyOrder;
        return totalPrice;
    }
    public double recalTotal( Order o){
        return totalPrice += unitPrice * qtyOrder;
    }
    public String toString() {
        return "Customer name: "+cusName+" | CusNumber: "+cusNb+" | Quantity Order: "+qtyOrder+" | Unit Price: "+unitPrice+"\n----------------------------------------------------------------------------------------\nTotal Price: "+totalPrice;
    }

}
