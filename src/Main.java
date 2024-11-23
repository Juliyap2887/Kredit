import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CreditPaymentService service = new CreditPaymentService();
        int platezh;
        int summa = 1_000_000;
        double stavka = 9.99;

        int k = 0;
        for (int srok = 0; srok <= 1000; srok++) {
        //    srok = in.nextInt();
            if ((srok < 12) || (srok > 12 * 5)) {
                System.out.println(srok + "m. ошибка");
            } else {
                platezh = service.calculate(summa, srok, stavka);

                System.out.println(srok + "m. " + platezh + " руб.");
            }


        }
    }
}