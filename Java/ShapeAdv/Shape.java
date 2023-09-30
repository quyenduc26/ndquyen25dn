package ShapeAdv;

public class Shape {
    private String color ="red";
    private boolean filled =true;

    public Shape(){}//default

//Shape1
    public Shape(String color, boolean filled){
            this.color= color;
            this.filled= filled;
    }
//set,get 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
//set
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
//toString
    public String toString() {
        return "Color: "+color+" | Filled: "+filled;
    }
}
