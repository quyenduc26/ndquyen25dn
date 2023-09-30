package ShapeAdv;
import java.util.Scanner;
public class testFile {
    public static void main(String [] args){
        Shape s = new Shape("Orange",true);
        Circle c1= new Circle();
        System.out.println(s.toString());
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle();
        Square sq1 = new Square();
        sq1.setColor("Blue");
        sq1.setSide(1.4);
        r1.setLength(3);
        System.out.println(r1.toString());
        System.out.println(sq1.toString());
        
    }
    
}
