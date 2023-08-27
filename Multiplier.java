package overload;

public class Multiplier {

    public int multiplier(int number){
        return number * 2;
    }
    public int multiplier(int number_1, int number_2){
        return number_1 * number_2;
    }
    public double multiplier(double number_1, double number_2){
        return number_1 * number_2;
    }
    public double multiplier(double number_1, int number_2){
        return number_1 * number_2;
    }
    public double multiplier(int number_1, double number_2){
        return number_1 * number_2;
    }

}
