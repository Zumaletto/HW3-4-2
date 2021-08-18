public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = (10000 * weight / (height * height));
        return bmi;
    }
}
