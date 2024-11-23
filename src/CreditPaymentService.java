public class CreditPaymentService {
    public int calculate(int summa, int srok, double stavka) {
        double platezh;
        double r = stavka / 100 / 12; // ежемесячная ставка

        platezh = summa * r * Math.pow(1 + r,srok) / (Math.pow(1 + r, srok) - 1);


        return (int) platezh;
    }
}
