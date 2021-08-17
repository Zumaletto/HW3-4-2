public class BmiService {
    public int calculate(int weight, int height) {
        int bmi = (10000 * weight / (height * height));

        if (bmi < 18.5) {
            System.out.println("Ниже нормального веса");
        } else if (bmi >= 18.5 & bmi < 25) {
            System.out.println("Нормальный вес");
        } else if (bmi >= 25 & bmi < 30) {
            System.out.println("Избыточный вес");
        } else if (bmi >= 30 & bmi < 35) {
            System.out.println("Ожирение I степени");
        } else if (bmi >= 35 & bmi < 40) {
            System.out.println("Ожирение II степени");
        } else if (bmi >= 40) {
            System.out.println("Ожирение III степени");
        }
        return bmi;
    }
}
