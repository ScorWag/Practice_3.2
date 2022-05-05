public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(75.5F, 1.86F);
        System.out.println("Индекс массы тела = " + bmi);
    }
}
