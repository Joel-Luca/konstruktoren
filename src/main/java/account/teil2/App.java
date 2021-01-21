package account.teil2;

public class App {
    public static void main(String[] args) {

        private Person TeamH = {moritz, joel1, yanik, }

        Account[] accounts = Account.createAccounts(TeamH);

        for (Account account : accounts) {
            try {
                double max = RandomHelper.getRandomDouble(1, 1000);
                account.zahleEin(max);
                account.hebeAb(RandomHelper.getRandomDouble(1, max));
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        int index = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getSaldo() > accounts[index].getSaldo()) {
                index = i;
            }
        }
        System.out.println("Der " + (index + 1) + ".Account hat den grössten Betrag: " + accounts[index].getSaldo());
    }
}
