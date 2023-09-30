package Advprg;

public class testFile {
    public static void main ( String [] args){
        Order o1 = new Order("Quyen", "1234", 15000,24);
        o1.calTotal();
        System.out.println(o1.toString());
    }
}
