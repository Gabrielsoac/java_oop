package learning_oop.classes;

public class Rectangle {
    Double width;
    Double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double area() {
        return width * height;
    }
    public double perimeter(){
        return 2 * (width + height);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }
    public String toString() {
        return "AREA: " + String.format("%.2f", area())
                + "\nPERIMETER: " + String.format("%.2f", perimeter())
                + "\nDIAGONAL: " + String.format("%.2f", diagonal());
    }
}
