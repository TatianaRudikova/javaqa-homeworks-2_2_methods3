public class CreditPaymentService {
    public double calculate(int period, int summ, double percent) {

        //процентная ставка по кредиту в месяц
        double monthPercent = percent / 12 / 100;

        //коэффициент аннуитента

        double a1 = (1 + monthPercent);
        int b1 = period;
        double c1 = Math.pow(a1, b1);
        double koff = monthPercent + monthPercent / (c1 - 1);

        //платеж в месяц
        double payment = koff * summ;
        return payment;
    }


}