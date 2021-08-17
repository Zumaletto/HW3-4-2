public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 89;
        int height = 167;
        int bmi = service.calculate(weight,height);
        System.out.println(bmi);
    }
}
