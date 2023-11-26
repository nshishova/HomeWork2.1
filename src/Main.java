public class Main {

    public static void main(String[] args) {

        System.out.println("Top up program");

        int initialBalance = 150;
        int topUpMin = 500;
        int topUpAmount = 550;
        int bonusPerRub = 33;


        if (topUpAmount >= topUpMin) {
            int total = (topUpAmount / bonusPerRub) + topUpAmount + initialBalance;
            System.out.println("Total balance with bonus: " + total + "RUB");

        } else {
            int total = initialBalance + topUpAmount;
            System.out.println("Total balance: " + total + "RUB");

        }

    }
}
