package learning_oop.classes;

public class Triangle {
    private Double side_1;
    private Double side_2;
    private Double side_3;

    public double getSide_1() {
        return side_1;
    }
    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }
    public double getSide_2() {
        return side_2;
    }
    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }
    public double getSide_3() {
        return side_3;
    }
    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }
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
