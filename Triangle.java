package learning_oop;

public class Triangle {
    public double side_1;
    public double side_2;
    public double side_3;

    public Triangle(){
    }
    public Triangle(double side_1, double side_2, double side_3){
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }
    public double calc_area_triangle(){
        double p = (side_1 + side_2 + side_3) / 2;
        double result = Math.sqrt( p * (p - side_1) * (p - side_2) * (p - side_3));

        return result;
    }
    public double calc_area_triangle(double side_1, double side_2, double side_3) {
        double p = (side_1 + side_2 + side_3) / 2;
        double result = Math.sqrt(p * (p - side_1) * (p - side_2) * (p - side_3));

        return result;
    }
}
