public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 89.0;
        double height = 167;
        double a = service.calculate(89.0,167.0);
        double roundOff = Math.round(a*100)/100D;
        double bmi = roundOff;
        System.out.println("ИМТ :" + bmi);

        if (bmi < 18.5) {
            System.out.println("Ниже нормального веса");
        } else if (bmi >= 18.5 & bmi < 25.0) {
            System.out.println("Нормальный вес");
        } else if (bmi >= 25.0 & bmi < 30.0) {
            System.out.println("Избыточный вес");
        } else if (bmi >= 30.0 & bmi < 35.0) {
            System.out.println("Ожирение I степени");
        } else if (bmi >= 35.0 & bmi < 40.0) {
            System.out.println("Ожирение II степени");
        } else if (bmi >= 40.0) {
            System.out.println("Ожирение III степени");
        }
    }
}
