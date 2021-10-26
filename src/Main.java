public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        double platezPeriod12 = service.calculate(12, 1_000_000, 9.99);
        System.out.println(Math.round(platezPeriod12));

        double platezPeriod24 = service.calculate(24, 1_000_000, 9.99);
        System.out.println(Math.round(platezPeriod24));

        double platezPeriod36 = service.calculate(36, 1_000_000, 9.99);
        System.out.println(Math.round(platezPeriod36));
    }

}

