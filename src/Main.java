public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int addAmount = 1100;
        int totalAmount = 100;
        int bonus;

        if (addAmount > 1000) {
            bonus = addAmount / 100;
            totalAmount = initialAmount + addAmount + bonus;
        } else {
            bonus = 0;
            totalAmount = initialAmount + addAmount;
        }

        System.out.println("Итоговый счет - " + totalAmount + " рублей");
        System.out.println("Бонус - " + bonus + " рублей");
    }
}