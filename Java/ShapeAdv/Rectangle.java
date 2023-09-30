package ShapeAdv;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length= 1.0;

    public Rectangle(){}
//Rectangle 1
    public Rectangle(double width, double length){
        this.length= length;
        this.width= width;
    }
//Rectangle2
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width= width;
        this.length= length;
    }
//set,get
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
//get area,perimeter
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;    
    }
//toString
    public String toString() {
        return "Shape: Rectangle | "+super.toString() + " | Length: " + length+" | Width: "+width;
    }
}
