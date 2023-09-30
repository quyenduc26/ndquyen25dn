package ShapeAdv;
import java.lang.Math;
public class Circle extends Shape{
    private double radius= 1.0;

    public Circle(){}//default 
//Circle1
    public Circle(double radius){
        this.radius=radius;
    }
//Circle2
    public Circle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius= radius;
    }
//get,set
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        super.setColor(color);
    }
//get area, perimeter
    public double getArea(){
        double s= Math.PI*radius*radius;
        return s;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
//toString
    public String toString() {
        return "Shape: Circle | "+" | Radius: "+radius;
    }
    
}
