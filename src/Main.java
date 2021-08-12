public class Main {
    public static void main(String[] args) {

        int bill = 100;
        int refill = 8575;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int totalBill = bill + bonus + refill;
        System.out.println(totalBill);
        System.out.println(bonus);

    }
}
