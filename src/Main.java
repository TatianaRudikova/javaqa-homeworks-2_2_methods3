public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();


        double paymentPeriod12 = service.calculate(12, 1_000_000, 9.99);
        System.out.println(Math.round(paymentPeriod12));

        double paymentPeriod24 = service.calculate(24, 1_000_000, 9.99);
        System.out.println(Math.round(paymentPeriod24));

        double paymentPeriod36 = service.calculate(36, 1_000_000, 9.99);
        System.out.println(Math.round(paymentPeriod36));
    }

}

